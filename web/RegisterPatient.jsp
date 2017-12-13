<%-- 
    Document   : RegisterPatient
    Created on : Sep 20, 2017, 9:02:20 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script src=js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>


        <!--style-->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/wjRegisterStyle.css" rel="stylesheet">

        <!--font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Prompt" rel="stylesheet">

        <title>ลงทะเบียนผู้ป่วย</title>
    </head>

    <body>
        <!-- header -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                        <img alt="WATJAI" src="image/logoweb02.png" width="150" style="margin-top: -0.2em;">
                    </a>
                    <div class="pull-right logout">
                        <span style="color: #00939a;font-size: 12pt;">
                            นายแพทย์สวัสดี ทวีสุจ </span>
                        <a href="Login.jsp" style="color: white"> ลงชื่อออก </a>
                    </div>

                </div>

            </div><!-- /.container-fluid -->
        </nav>


        <!-- side bar -->

        <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">

            <ul class="nav menu">
                <li class="customWH"><a href="/Watjai/ShowAllPatient" > รายชื่อผู้ป่วยทั้งหมด</a></li>
                <li class="customWH"><a href="/Watjai/ShowDiaPatient"> รายชื่อผู้ป่วยรอการวินิจฉัย</a></li>
                <li class="active customWH"><a href="/Watjai/RegisterPatient.jsp"> ลงทะเบียนผู้ป่วย</a></li>
                <li class="customWH"><a href="#"> จัดการผู้ป่วย </a></li>
            </ul>

        </div><!--/.sidebar-->

        <!-- content-->
        <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">

            <div class="row">
                <ol class="breadcrumb">
                    <li class="active">ลงทะเบียนผู้ป่วย</a></li>

                </ol>
            </div><!--/.row-->

            <!-- title main -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">ลงทะเบียนผู้ป่วย</h1>
                </div>
            </div><!--/.row-->

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default di">
                        <form action="der" method="post">
                            <table>
                                <tr height="75px"> 
                                    <td width="110px" >ชื่อ</td>
                                    <td ><input type="text" name="fname" placeholder="ชื่อ" class="info-pat"  pattern=".{2,50}"/></td>
                                    <td width="110px" >นามสกุล</td>
                                    <td><input type="text" name="lname" placeholder="นามสกุล" class="info-pat" pattern=".{2,50}" /></td>
                                </tr>
                                <tr height="75px">
                                    <td >วันเกิด</td>
                                    <td><input type="date" name="birthDate"  class="info-pat" required/></td>
                                    <td >เพศ</td>
                                    <td>
                                        <!--<input type="text" name="sex"  class="info-pat" required/>-->
                                        <select name="sex"  class="info-pat" >
                                            <option value="ชาย">ชาย</option>
                                            <option value="หญิง">หญิง</option>

                                        </select>
                                    </td>
                                </tr>
                                <tr height="75px">
                                    <td >กรุ๊ปเลือด</td>
                                    <td>
                                        <!-- <input type="text" name="bloodtype"  class="info-pat" required/>-->
                                        <select name="bloodtype"  class="info-pat" >
                                            <option value="A">A</option>
                                            <option value="AB">AB</option>
                                            <option value="B">B</option>
                                            <option value="O">O</option>
                                        </select>

                                    </td>
                                    <td >โรคประจำตัว</td>
                                    <td>
                                        <input type="text" name="undl" class="info-pat" placeholder="โรคประจำตัว" required style="
                                               margin-right: 0px;">
                                        <span style="font-size: 9pt;">(หากไม่มี ให้ระบุว่า "ไม่มี" )</span>
                                    </td>
                                </tr>
                                <tr height="75px" >
                                    <td >ที่อยู่</td>
                                    <td><input type="text" name="address"   class="info-pat" placeholder="บ้านเลขที่/หมู่บ้าน" required/></td>
                                    <td >ตำบล</td>
                                    <td><input type="text" name="subDis"  class="info-pat"placeholder="ตำบล" required/></td>
                                </tr>
                                <tr height="75px" >
                                    <td >อำเภอ</td>
                                    <td><input type="text" name="district"  class="info-pat" placeholder="อำเภอ" required/></td>
                                    <td>จังหวัด</td>
                                    <td><input type="text" name="province"  class="info-pat" placeholder="จังหวัด" required /></td>
                                </tr>

                                <tr  height="75px">
                                    <td >เบอร์โทรศัพท์</td>
                                    <td><input type="text" name="tel"   class="info-pat" placeholder="เบอร์โทรศัพท์" required /></td>
                                    <td >แพทย์ที่ดูแล</td>

                                    <td>
                                        <input type="text" name="docterId" class="info-pat" readonly  value="นายแพทย์สวัสดี ทวีสุจ"/></td>       
                                    </td>
                                </tr>

                            </table><br>
                            <div class="submit-btn">
                                <input  type="submit" value="register"  />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>

    <!--

/* <label>ชื่อ</label>
<input type="text" name="fname" placeholder="ชื่อ">

<label>นามสกุล</label>
<input type="text" name="lname" placeholder="นามสกุล">

<label>วันเกิด</label>
<input type="text" name="birthdate" placeholder="ปี-เดือน-วันเกิด"> <br>

<label>ที่อยู่</label>
<input type="text" name="address" placeholder="บ้านเลขที่ หมู่">
<input type="text" name="subDistrict" placeholder="แขวง/ตำบล">
<input type="text" name="district" placeholder="เขต/อำเภอ">
<input type="text" name="province" placeholder="จังหวัด">
<br>
<label>เบอร์โทรศัพท์</label>
<input type="text" name="patTel" placeholder="เบอร์โทรศัพท์">
<label>กรุ๊ปเลือด</label>
<input type="text" name="bloodType" placeholder="กรุ๊ปเลือด">
<label>แพทย์ที่ดูแล</label>
<select name="docterId">
    <option value="volvo">DO1708001</option>
    <option value="saab">DO1708001</option>
</select><br>
<label>โรคประจำตัว</label>
<input type="text" name="underlyingDisease" placeholder="โรคประจำตัว">
<input type="submit" name="submit" value="ลงทะเบียน">*/-->

</html>

