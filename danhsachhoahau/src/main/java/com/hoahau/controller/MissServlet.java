package com.hoahau.controller;

import com.hoahau.model.Miss;
import com.hoahau.service.MissServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MissServlet", urlPatterns = "/misss")

public class MissServlet extends HttpServlet {
    private MissServiceImpl missService = new MissServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createMiss(request, response);
                break;
            case "edit":
                updateMiss(request, response);
                break;
            case "delete":
                deleteMiss(request, response);
                break;
            case "approval":
                listApproval(request, response);
            default:
                break;
        }
    }

    private void listApproval(HttpServletRequest request, HttpServletResponse response) {
        List<Miss> missList = new ArrayList<>();
        List<Miss> list = missService.findAll();
        for (Miss miss : list){
            if (miss.getApproval().equals("Yes")){
                missList.add(miss);
            }
        }
        request.setAttribute("miss", missList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/approval.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("miss/error.jsp");
        } else {
            this.missService.remove(id);
            try {
                response.sendRedirect("/misss");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String brithday = request.getParameter("brithday");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String passport = request.getParameter("passport");
        String job = request.getParameter("job");
        String educational = request.getParameter("educational");
        String nation = request.getParameter("nation");
        String studyunit = request.getParameter("studyunit");
        float heigth = Float.parseFloat(request.getParameter("heigth"));
        float weigth = Float.parseFloat(request.getParameter("weigth"));
        String gift = request.getParameter("gift");
        String image = request.getParameter("image");
        String provincial = request.getParameter("provincial");
        String approval = request.getParameter("approval");
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            miss.setName(name);
            miss.setBrithday(brithday);
            miss.setAddress(address);
            miss.setPhone(phone);
            miss.setEmail(email);
            miss.setPassport(passport);
            miss.setJob(job);
            miss.setEducational(educational);
            miss.setNation(nation);
            miss.setStudyunit(studyunit);
            miss.setHeigth(heigth);
            miss.setWeigth(weigth);
            miss.setGift(gift);
            miss.setImage(image);
            miss.setProvincial(provincial);
            miss.setApproval(approval);
            this.missService.update(id, miss);
            request.setAttribute("miss", miss);
            request.setAttribute("message", "Miss information was updated");
            dispatcher = request.getRequestDispatcher("miss/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void createMiss(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String brithday = request.getParameter("brithday");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String passport = request.getParameter("passport");
        String job = request.getParameter("job");
        String educational = request.getParameter("educational");
        String nation = request.getParameter("nation");
        String studyunit = request.getParameter("studyunit");
        float heigth = Float.parseFloat(request.getParameter("heigth"));
        float weigth = Float.parseFloat(request.getParameter("weigth"));
        String gift = request.getParameter("gift");
        String image = request.getParameter("image");
        String provincial = request.getParameter("provincial");
        String approval = request.getParameter("approval");
        int id = (int) (Math.random() * 10000);
        Miss miss = new Miss(id, name, brithday, address, phone, email, passport, job, educational, nation, studyunit, heigth, weigth, gift, image, provincial,approval);
        this.missService.add(miss);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/create.jsp");
        request.setAttribute("message", "New miss was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                viewMiss(request, response);
                break;
            case "duyet":
                listApproval(request, response);
                break;
            default:
                listMiss(request, response);
                break;
        }
    }


    private void viewMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null){
            dispatcher = request.getRequestDispatcher("miss/error.jsp");
        }else {
            request.setAttribute("miss", miss);
            dispatcher = request.getRequestDispatcher("miss/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("miss/error.jsp");
        } else {
            request.setAttribute("miss", miss);
            dispatcher = request.getRequestDispatcher("miss/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("miss/error.jsp");
        } else {
            request.setAttribute("miss", miss);
            dispatcher = request.getRequestDispatcher("miss/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listMiss(HttpServletRequest request, HttpServletResponse response) {
        List<Miss> misss = missService.findAll();
        request.setAttribute("misss", misss);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

}
