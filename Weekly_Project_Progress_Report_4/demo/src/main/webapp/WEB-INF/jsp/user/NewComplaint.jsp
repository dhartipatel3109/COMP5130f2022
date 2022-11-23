<!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="../public/assets/images/favicon.png">
    <title>New Complaint</title>
    <!-- Custom CSS -->

    <link href="../public/assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
    <link href="../public/assets/extra-libs/jvector/jquery-jvectormap-2.0.2.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href="../public/dist/css/style.css" rel="stylesheet">
    <link href="../public/programs/assets/css/select2.css" rel="stylesheet" />
  
</head>

<body>

	<%@ include file="Header.jsp" %>

		<div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-7 align-self-center">
                        <h4 class="page-title text-truncate text-dark font-weight-medium mb-1">New Complaint</h4>
                        <div class="d-flex align-items-center">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb m-0 p-0">
                                    <li class="breadcrumb-item"><a href="../user/dashboard.html" class="text-muted">Home</a></li>
                                    <li class="breadcrumb-item text-muted active" aria-current="page">New Complaint</li>
                                </ol>
                            </nav>
                        </div>
                    </div>

                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== -->
            <div class="container-fluid">
                <!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex align-items-center mb-4">
                                    <h4 class="card-title">Complaint Registration Form</h4>
                                </div>
                                <x-alert type="ValidationError" />
                                <div class="table-responsive">
                                    <form action="//" method="POST" enctype="multipart/form-data">
                                        
                                        <table class="table table-bordered" width="80%" cellspacing="0">
                                            <tr>
                                                <th>Complaint Type</th>
                                                <td>
                                                    <select class="form-control" id="Complaint Type" name="complaintType" required>
                                                        <option value="">Select Type</option>
                                                        <option value="Complaint" }>Complaint</option>
                                                        <option value="Query" >Query</option>
                                                    </select>
                                                </td>
                                                <th>Complaint Category</th>
                                                <td>
                                                    <select class="form-control" id="Complaint Category" name="complaintCategory" required>
                                                        <option value="">Select Category</option>
                                                        <option value="Government">Government</option>

                                                        <option value="Non-Government">Non-Government</option>
                                                    </select>
                                                </td>
                                            </tr>

                                            <tr>
                                                <th>Sub-Catogory</th>
                                                <script type="text/javascript" src="../Data/SubCategory.js"></script>
                                                <td>
                                                    <select name="subCategory" class="form-control" id="Sub_Category" required></select>
                                                </td>
                                                <th>Authority Department/Company</th>

                                                <td>
                                                    <script type="text/javascript" src="Data/SubCategory.js"></script>
                                                    <select name="AuthDept" class="form-control" id="AuthDept" required></select>
                                                </td>
                                            </tr>
                                            <script language="javascript">
                                                SubCategory("Sub_Category", "AuthDept");

                                            </script>
                                            <tr>
                                                <th>Nature of Complaint
                                                <td> <input type="text" class="form-control" name="complaintNature" id="Nature" placeholder="Nature Of Complaint" value="" required></td>

                                                </th>
                                                <th>Date of Complaint</th>
                                                <td><input type="date" name="complaintDate" class="form-control" id="DateOfComp" value="{{ old('complaintDate') }}" required></td>
                                            </tr>
                                            

                                            <tr>
                                                    
                                                <th>Ref. No</th>
                                                <td>
                                                    <p>Ex.- Doc. NO. ,Order No. ,Customer Id,etc.</p><input name="refNo" type="text" class="form-control" id="Refno" placeholder="Ref.No" value="" required>
                                                </td>
                                            </tr>

                                            <tr>
                                                <th>Complaint Details</th>
                                                <td><textarea rows="3" cols="40" name="complaintDetails" class="form-control" placeholder="Please Enter Complaint Details" required></textarea></td>
                                            </tr>
                                            <tr>
                                                <th>Document 1</th>
                                                <td> <input type="file" class="form-control-file" id="Doc1" placeholder="Doc1" name="document1" accept="application/pdf,.doc,.docx,image/*"></td>
                                                <th>Document 2</th>
                                                <td> <input type="file" class="form-control-file" id="Doc2" placeholder="Doc2" name="document2" accept="application/pdf,.doc,.docx,image/*"></td>
                                            </tr>
                                        </table>
                                        <br><br>

                                        <button class="btn btn-success"> <i data-feather="check-circle" class="feather-icon"></i>&nbsp;&nbsp;Register Complaint</button>
                                    </form>
                                </div>

                            </div> <!-- end card-body-->
                        </div> <!-- end card-->
                    </div> <!-- end col-->
                </div>
                <!-- end row -->



                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
            </div>
            <!-- ============================================================== -->
            <!-- End Container fluid  -->
            <!-- ============================================================== -->
            <!-- Info Alert Modal -->
            <div id="info-alert-modal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                <div class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-body p-4">
                            <div class="text-center">
                                <i class="dripicons-information h1 text-info"></i>
                                <h4 class="mt-2">Heads up!</h4>
                                <p class="mt-3">Cras mattis consectetur purus sit amet fermentum.
                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam.</p>
                                <button class="btn btn-info my-2" data-dismiss="modal">Continue</button>
                            </div>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

            <!-- ============================================================== -->
            <!--  Modal content for the above example -->
            <div class="modal fade" id="bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="myLargeModalLabel">Logout</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        </div>
                        <div class="modal-body">

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-light" data-dismiss="modal"><i data-feather="x" class="feather-icon"></i> Close</button>
                            <a href="#" class="btn btn-primary"><i data-feather="log-out" class="feather-icon"></i> Logout</a>

                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            <%@ include file="Footer.jsp" %>




</body>
</html>