
show tables;

CREATE TABLE OfficialDocuments (
  officialDocumentsID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  businessMethodReport BLOB,
  productSummaryReport BLOB,
  insuranceCondition BLOB,
  PRIMARY KEY (officialDocumentsID)
);

CREATE TABLE Insurance (
  insuranceID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  insuranceMoneyLimit INT(11) unsigned,
  insuranceName varchar(32),
  insuranceType varchar(32),
  explanation varchar(32),
  officalDocumentsID INT(11),
  PRIMARY KEY (insuranceID),
  foreign key(officalDocumentsID) references officalDocuments (officalDocumentsID)
);

CREATE TABLE VerificationDocumentList (
  verificationDocumentListID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (verificationDocumentListID)
);

CREATE TABLE VerificationDocument (
	verificationDocumentID INT(11) unsigned NOT NULL AUTO_INCREMENT,
    verificationDocumentListID INT(11),
    PRIMARY KEY (verificationDocumentID),
	foreign key(verificationDocumentListID) references VerificationDocumentList (verificationDocumentListID)
);

CREATE TABLE InsuranceDocumentList (
	insuranceDocumentListID INT(11) unsigned NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (insuranceDocumentListID)
);

CREATE TABLE InsuranceDocument (
  insuranceDocumentID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  insuranceDocumentListID INT(11) unsigned,
  insuranceDocument BLOB,
  PRIMARY KEY (insuranceDocumentID),
  foreign key(insuranceDocumentListID) references InsuranceDocumentList (insuranceDocumentListID)
);

CREATE TABLE InsurancePaymentList (
  insurancePaymentListID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  completedPayment INT(11) unsigned,
  uncompletedPayment INT(11) unsigned,
  insurancePaymentPeriod date,
  PRIMARY KEY (InsurancePaymentListID)
);

CREATE TABLE InsurancePayment (
  insurancePaymentID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  insurancePaymentListID INT(11) unsigned,
  oneTimeInsurancePayment INT(11) unsigned,
  insurancePaymentDate date,
  PRIMARY KEY (InsurancePayment),
  foreign key(insurancePaymentListID) references InsurancePaymentList (insurancePaymentListID)
);

CREATE TABLE ContractManager (
  contractManagerID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  team varchar(16),
  contractManagerName varchar(16),
  jobPosition varchar(16),
  PRIMARY KEY (contractManagerID),
  foreign key(insurancePaymentListID) references InsurancePaymentList (insurancePaymentListID)
);

CREATE TABLE Customer (
  customerID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  team varchar(16),
  contractManagerName varchar(16),
  jobPosition varchar(16),
  PRIMARY KEY (contractManagerID),
  foreign key(insurancePaymentListID) references InsurancePaymentList (insurancePaymentListID)
);

CREATE TABLE Contract (
  contractID INT(11) unsigned NOT NULL AUTO_INCREMENT,
  lossRate float,
  profitabilityRating varchar(32),
  remainingExpectedMoney INT(11),
  compensationHistory INT(11),
  insurancePayment INT(11),
  discountRate float,
  extraChargeRate float,
  paymentType varchar(32),
  compensationType varchar(32),
  bank varchar(16),
  contractRemainingPeriod date,
  contractExpirationDate date,
  insurancePaymentListID INT(11),
  insuranceDocumentListID INT(11),
  customerID INT(11),
  salesmanID INT(11),
  recipientID INT(11),
  contractManagerID INT(11),
  PRIMARY KEY (contractID),
  foreign key(insurancePaymentListID) references InsurancePaymentList (insurancePaymentListID),
  foreign key(insuranceDocumentListID) references InsuranceDocumentList (insuranceDocumentListID),
  foreign key(customerID) references Customer (customerID),
  foreign key(salesmanID) references Salesman (salesmanID),
  foreign key(recipientID) references Recipient (recipientID),
  foreign key(contractManagerID) references ContractManager (contractManagerID)
);
