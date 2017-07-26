package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

public class PanelMetabolic {

	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 * @return exam object
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "2345-7":
			exam.setDisplayCode("Glucose [Mass/volume] in Serum or Plasma");
			exam.setCode("2345-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2345-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "3094-0":
			exam.setDisplayCode("Urea nitrogen [Mass/volume] in Serum or Plasma");
			exam.setCode("3094-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/3094-0.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2160-0":
			exam.setDisplayCode("Creatinine [Mass/volume] in Serum or Plasma");
			exam.setCode("2160-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2160-0.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "3097-3":
			exam.setDisplayCode("Urea nitrogen/Creatinine [Mass Ratio] in Serum or Plasma");
			exam.setCode("3097-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/3097-3.html?sections=Comprehensive");
			exam.setUnit("mg/mg{creat}");
			break;
		case "33914-3":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M.predicted [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("33914-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/33914-3.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "50044-7":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among females [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("50044-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/50044-7.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "48642-3":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among non-blacks [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("48642-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/48642-3.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "48643-1":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among blacks [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("48643-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/48643-1.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "17861-6":
			exam.setDisplayCode("Calcium [Mass/volume] in Serum or Plasma");
			exam.setCode("17861-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/17861-6.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2885-2":
			exam.setDisplayCode("Protein [Mass/volume] in Serum or Plasma");
			exam.setCode("2885-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/2885-2.html?sections=Comprehensive");
			exam.setUnit("g/dL");
			break;
		case "1751-7":
			exam.setDisplayCode("Albumin [Mass/volume] in Serum or Plasma");
			exam.setCode("1751-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/1751-7.html?sections=Comprehensive");
			exam.setUnit("g/dL");
			break;
		case "10834-0":
			exam.setDisplayCode("Globulin [Mass/volume] in Serum by calculation");
			exam.setCode("10834-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/10834-0.html?sections=Comprehensive");
			exam.setUnit("g/L");
			break;
		case "1759-0":
			exam.setDisplayCode("Albumin/Globulin [Mass Ratio] in Serum or Plasma");
			exam.setCode("1759-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/1759-0.html?sections=Comprehensive");
			exam.setUnit("{ratio}");
			break;
		case "1975-2":
			exam.setDisplayCode("Bilirubin.total [Mass/volume] in Serum or Plasma");
			exam.setCode("1975-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/1975-2.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "6768-6":
			exam.setDisplayCode("Alkaline phosphatase [Enzymatic activity/volume] in Serum or Plasma");
			exam.setCode("6768-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/6768-6.html?sections=Comprehensive");
			exam.setUnit("U/L");
			break;
		case "1742-6":
			exam.setDisplayCode("Alanine aminotransferase [Enzymatic activit/volume] in Serum or Plasma");
			exam.setCode("1742-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/1742-6.html?sections=Comprehensive");
			exam.setUnit("U/L");
			break;
		case "1920-8":
			exam.setDisplayCode("Aspartate aminotransferase [Enzymatic activity/volume] in Serum or Plasma");
			exam.setCode("1920-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/1920-8.html?sections=Comprehensive");
			exam.setUnit("U/L");
			break;

		}

		return exam;
	}

	/**
	 * 
	 * @return exam name list
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("2345-7");
		listExam.add("3094-0");
		listExam.add("2160-0");
		listExam.add("3097-3");
		listExam.add("33914-3");
		listExam.add("50044-7");
		listExam.add("48642-3");
		listExam.add("48643-1");
		listExam.add("17861-6");
		listExam.add("2885-2");
		listExam.add("1751-7");
		listExam.add("10834-0");
		listExam.add("1759-0");
		listExam.add("1975-2");
		listExam.add("6768-6");
		listExam.add("1742-6");
		listExam.add("1920-8");
		return listExam;
	}

}
