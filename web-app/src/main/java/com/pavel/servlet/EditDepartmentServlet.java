package com.pavel.servlet;

import com.pavel.university.entity.Department;
import com.pavel.university.entity.Faculty;
import com.pavel.university.service.DepartmentService;
import com.pavel.university.service.FacultyService;
import com.pavel.university.service.impl.DepartmentServiceImpl;
import com.pavel.university.service.impl.FacultyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Pavel on 03.05.2014.
 */
public class EditDepartmentServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idFaculty = request.getParameter("IdFaculty");
        String name = request.getParameter("Name");
        String idDepartment = request.getParameter("IdDepartment");

        int idFac = Integer.parseInt(idFaculty);
        int idDep = Integer.parseInt(idDepartment);


        DepartmentService departmentService = new DepartmentServiceImpl();
        FacultyService facultyService = new FacultyServiceImpl();
        Department department = new Department();
        Faculty faculty = facultyService.getFacultyById(idFac);
        department.setFaculty(faculty);
        department.setName(name);
        department.setIdDepartment(idDep);
        departmentService.editDepartment(department);

        response.sendRedirect("DepartmentDb.jsp");
    }
}
