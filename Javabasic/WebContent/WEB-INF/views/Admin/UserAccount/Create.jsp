
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags"%>
<mt:admin_template title="" >
	<jsp:attribute name="content">
		<style>
		.sty{
			margin-bottom: 20px
		}
		</style>
		<div style="text-align: center;"><h2>Create Account</h2></div>
		<hr>
		<form class="needs-validation" action="Create" method="post" novalidate>		
					<div class="form-inline">
							<div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">User Name</label>
		                                    <div class="col-md-1">
			                                    <input class="form-control" value="${userName2}"
															type="text" name="userName2" required="required">
											</div>
		                            </div>
		                    </div>
		                    
		                    <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Password</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control" 
														type="password" name="password" required="required">
		                                </div>
		                            </div>
		                    </div>
		                    
		                     <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">First Name</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control" value="${firstName }"
														type="text" name="firstName" required="required">
		                                </div>
		                            </div>
		                    </div>
		                     <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Last Name</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control" value="${lastName }"
														type="text" name="lastName" required="required">
		                                </div>
		                            </div>
		                    </div>
		                     <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Date Of Birth</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control datepicker" value="${dateOfBirth }"
												autocomplete="off"		type="text" name="dateOfBirth" required="required">
		                                </div>
		                            </div>
		                    </div>
		                    <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Phone Number</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control" value="${phoneNumber }"
														type="text" name="phoneNumber" required="required">
		                                </div>
		                            </div>
		                    </div>
		                    <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Profile Picture</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control" value="${point}"
														type="text" name="profilePicture">
		                                </div>
		                            </div>
		                    </div>
		                    <div class="col-md-6 sty">
		                            <div class="form-group">
		                            	<label class="control-label col-md-5">Point</label>
		                                
		                                <div class="col-md-1">
		                                    <input class="form-control"  value="${point}"
														type="text" name="point">
		                                </div>
		                            </div>
		                    </div>
		                    <div class="col-md-12 sty">
									
										<p style="color: red;"> ${Notification}</p>
								
							</div>
		                    
		                  
	                            <div class="col-md-offset-2 col-md-10">
	                                <button type="submit"
										name="submit" class="btn  btn-danger">Save </button>  
									<a href="/SampleWeb/Management/UserAccount"
										 class="btn btn-primary">Cancel</a>	           
	                            </div>
                      
		                    
					</div>
				
				</form>
	</jsp:attribute>
</mt:admin_template>