package mainapp;

import dao.DanhSachChoMonHocDAO;
import pojo.SinhVien;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DanhSachChoMonHoc  extends JPanel implements ActionListener {
    JPanel pnClass;
    JButton btnCreate, btnDelete;
    JTable table;
    JScrollPane jspDSLop;
    JTextField txtClassCre, txtStudentIDCre, txtStudentNameCre, txtGenderCre, txtCMNDCre, txtSubjectCre, txtClassDel, txtMSSVDel, txtSubjectDel;

    public JPanel QLLMH() {
        //Class
        pnClass = new JPanel();
        TitledBorder titleClass = new TitledBorder("Danh sách lớp môn học");
        pnClass.setBorder(titleClass);
        pnClass.setLayout(new GridLayout(2, 1));

        JPanel pnInput = new JPanel();
        pnInput.setLayout(new GridLayout(1, 2));

        JPanel pnCreate = new JPanel();
        pnCreate.setLayout(new GridLayout(10, 2, 2, 2));
        TitledBorder titleCreate = new TitledBorder("Thêm mới");
        pnCreate.setBorder(titleCreate);
        JLabel lblClassCre = new JLabel("Tên lớp");
        txtClassCre = new JTextField(20);
        JLabel lblSubjectCre = new JLabel("Môn học");
        txtSubjectCre = new JTextField(20);
        JLabel lblStudentIDCre = new JLabel("Mã sinh viên");
        txtStudentIDCre = new JTextField(20);
        JLabel lblStudentNameCre = new JLabel("Họ tên");
        txtStudentNameCre = new JTextField(20);
        JLabel lblGenderCre = new JLabel("Giới tính");
        txtGenderCre = new JTextField(20);
        JLabel lblCMNDCre = new JLabel("CMND");
        txtCMNDCre = new JTextField(20);
        btnCreate = new JButton("Lưu");
        pnCreate.add(lblClassCre);
        pnCreate.add(txtClassCre);
        pnCreate.add(lblSubjectCre);
        pnCreate.add(txtSubjectCre);
        pnCreate.add(lblStudentIDCre);
        pnCreate.add(txtStudentIDCre);
        pnCreate.add(lblStudentNameCre);
        pnCreate.add(txtStudentNameCre);
        pnCreate.add(lblGenderCre);
        pnCreate.add(txtGenderCre);
        pnCreate.add(lblCMNDCre);
        pnCreate.add(txtCMNDCre);
        pnCreate.add(btnCreate);
        pnInput.add(pnCreate);

        JPanel pnDelete = new JPanel();
        pnDelete.setLayout(new GridLayout(11, 2, 2, 2));
        TitledBorder titleDelete = new TitledBorder("Xoá sinh viên");
        pnDelete.setBorder(titleDelete);
//        JLabel lblClassDel = new JLabel("Tên lớp");
//        txtClassDel = new JTextField(20);
        JLabel lblSubjectDel = new JLabel("Mã môn học");
        txtSubjectDel = new JTextField(20);
        JLabel lblMSSVDel = new JLabel("Mã sinh viên");
        txtMSSVDel = new JTextField(20);
        btnDelete = new JButton("Xoá");
//        pnDelete.add(lblClassDel);
//        pnDelete.add(txtClassDel);
        pnDelete.add(lblSubjectDel);
        pnDelete.add(txtSubjectDel);
        pnDelete.add(lblMSSVDel);
        pnDelete.add(txtMSSVDel);
        pnDelete.add(btnDelete);
        pnInput.add(pnDelete);

        JPanel pnListSV = new JPanel();
        TitledBorder titleLitsSV = new TitledBorder("Danh sách lớp môn học");
        pnListSV.setBorder(titleLitsSV);
        pnListSV.setLayout(new GridLayout(1, 1));
        table = new JTable();
        jspDSLop = new JScrollPane(table);
        pnListSV.add(jspDSLop);

        pnClass.add(pnInput);
        pnClass.add(pnListSV);

        //Add function
        btnCreate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnCreate.addActionListener(this);
        return pnClass;
    }


    public void actionPerformed(ActionEvent e) {

    }
}
