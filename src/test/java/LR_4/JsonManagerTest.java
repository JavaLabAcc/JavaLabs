package LR_4;

import java.io.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.LR_4.model.*;
import com.example.LR_4.controller.*;
import com.example.LR_4.JsonManager;

public class JsonManagerTest {
    @Test
    public void test() throws IOException{
        // ---- Start creating Faculty FIT ----
        // -- Start creating Department DIST --
        Student student_125_1 = StudentCreator.create("Oleksandr", "Boichenko", "Oleksandrovich", Sex.MAN);
        Student student_125_2 = StudentCreator.create("Yan", "Sheleg", "Pavlovich", Sex.MAN);
        Student student_172_1 = StudentCreator.create("Oleh", "Kozushko", "Leonidovich", Sex.MAN);
        Student student_172_2 = StudentCreator.create("Yulia", "Koval", "Volodimirovich", Sex.WOMAN);
        Student[] students_125 = {student_125_1, student_125_2};
        Student[] students_172 = {student_172_1, student_172_2};

        Group group_125 = GroupCreator.create(
            "125-20-1",
            "Ilya",
            "Olishevskiy",
            "Genadiyovich",
            Sex.MAN,
            students_125
        );
        Group group_172 = GroupCreator.create(
            "172-20-1",
            "Olena",
            "Nikolska",
            "Ihorivna",
            Sex.MAN,
            students_172
        );

        Group[] groups_DIST = {group_125, group_172};
        Department department_DIST = DepartmentCreator.create(
            "Department of Information Security and Telecommunications",
            "Valeriy",
            "Kornienko",
            "Ivanovich",
            Sex.MAN,
            groups_DIST
        );
        // -- Finish creating Department DIST --

        // -- Start creating Department SSCS --
        Student student_121_1 = StudentCreator.create("Oleksiy", "Scherban", "Romanovich", Sex.MAN);
        Student student_121_2 = StudentCreator.create("Kateryna", "Luzan", "Oleksiivna", Sex.WOMAN);
        Student student_122_1 = StudentCreator.create("Anastasia", "Malienko", "Andriivna", Sex.WOMAN);
        Student student_122_2 = StudentCreator.create("Andrii", "Parkhomenko", "Valentinovich", Sex.MAN);
        Student[] students_121 = {student_121_1, student_121_2};
        Student[] students_122 = {student_122_1, student_122_2};

        Group group_121 = GroupCreator.create(
            "121-20-3",
            "Laktionov",
            "Ivan",
            "Serhiyovich",
            Sex.MAN,
            students_121
        );
        Group group_122 = GroupCreator.create(
            "122-20-2",
            "Olga",
            "Shevchova",
            "Serhiivna",
            Sex.WOMAN,
            students_122
        );

        Group[] groups_SSCS = {group_121, group_122};
        Department department_SSCS = DepartmentCreator.create(
            "Department of Software Security for Computer Systems",
            "Mihaylo",
            "Alekseev",
            "Oleksandrovich",
            Sex.MAN,
            groups_SSCS
        );
        // -- Finish creating Department DIST --

        Department[] departmentsFIT = {department_DIST, department_SSCS};
        Faculty facultyFIT = FacultyCreator.create(
            "Faculty of Information Technologic",
            "Irina",
            "Udovik",
            "Mihaylivna",
            Sex.WOMAN,
            departmentsFIT
        );
        // ---- Finish creating Faculty FIT ----

        // ---- Start creating Faculty FEE ----
        // Department[] departmentsFEE = {};
        Faculty facultyFEE = FacultyCreator.create(
            "Faculty of Electrical Engineering",
            "Evgeniy",
            "Koshelenko",
            "Valeriyovich",
            Sex.MAN
            // departmentsFEE
        );
        // ---- Finish creating Faculty FEE ----

        Faculty[] faculties = {facultyFIT, facultyFEE};
        University oldUniversity = UniversityCreator.create(
            "National Technical University Dnipro Politechnical",
            "Oleksandr",
            "Azukovskii",
            "Oleksandrovich",
            Sex.MAN,
            faculties
        );

        String jsonFileName = "oldUniversity.json";
        JsonManager jsonManager = new JsonManager();

        jsonManager.writeFile(oldUniversity, jsonFileName);

        University newUniversity = (University) jsonManager.readFile(jsonFileName);

        assertEquals(oldUniversity, newUniversity);
    }
}
