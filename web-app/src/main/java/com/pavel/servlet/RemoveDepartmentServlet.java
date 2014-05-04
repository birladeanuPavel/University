package com.pavel.servlet;

import com.pavel.university.entity.Department;
import com.pavel.university.service.DepartmentService;
import com.pavel.university.service.impl.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 03.05.2014.
 */
public class RemoveDepartmentServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("Name");
        DepartmentService departmentService = new DepartmentServiceImpl();
        List<Department> departmentList = new ArrayList<Department>();
        departmentList = departmentService.getAllDepartment();

       for (Department department: departmentList ){
           if (name.equals(department.getName())){
               departmentService.removeDepartment(department);
           }
       }
        response.sendRedirect("DepartmentDb.jsp");
    }
}
