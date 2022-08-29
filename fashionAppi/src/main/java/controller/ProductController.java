package controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;


import model.PDFFile;
/**
 * @author kristina.salini
 *
 */

@Controller
public class ProductController {

	private Logger logger = LoggerFactory.getLogger(ProductController.class);

	@RequestMapping(value = "/helloWorld", method=RequestMethod.GET)
		public String hello(Model m) {
			m.addAttribute("mail", "hello world!");
			return "helloWorld";
	}
	

	@GetMapping("/welcome")
	public String Welcome(Model m) {
		m.addAttribute("message", "YoU aRe WeLcOmE to the FASHION SHOW *****");
		return "welcome";
	}

	@GetMapping("/productList")
	public String GetProductList() {
	    
		return "productList";
	}
	
	@GetMapping("/formTest")
	public String getFormTestView() {
		return "formTest";
	}
	
//	@RequestMapping(value="/zip", method= RequestMethod.POST)
//	void downloadAlacatedPdf(HttpServletResponse response) {
//		List<PDFFile> files = new ArrayList<>();
//		files.add(new PDFFile("erstes.pdf","HelloWorld".getBytes()));
//		files.add(new PDFFile("zweites.pdf","Some Content".getBytes())) ;
//		files.add(new PDFFile("drittes.pdf","This is not a portable document file".getBytes()));
//		
//		List<String> fileNames = new ArrayList<>();
//		for(PDFFile f : files) {
//			fileNames.add(f.getFilename());
//		}
//		
//		response.setContentType("application/zip");
//		response.setHeader("Content-Disposition", "attachment; filename=alacarte.zip");
//		
//		//String outputZipFileName = "alacarte.zip";
//		 try(ZipOutputStream zipOutputStream = new ZipOutputStream(response.getOutputStream())) {
//	            for(String fileName : fileNames) {
//	                FileSystemResource fileSystemResource = new FileSystemResource(fileName);
//	                ZipEntry zipEntry = new ZipEntry(fileSystemResource.getFilename());
//	                zipEntry.setSize(fileSystemResource.contentLength());
//	                zipEntry.setTime(System.currentTimeMillis());
//
//	                zipOutputStream.putNextEntry(zipEntry);
//
//	                StreamUtils.copy(fileSystemResource.getInputStream(), zipOutputStream);
//	                zipOutputStream.closeEntry();
//	            }
//	            zipOutputStream.finish();
//	        } catch (IOException e) {
//	            logger.error(e.getMessage(), e);
//	        }
//		
//		
//		
//	}
	@RequestMapping(value="/zip", method= RequestMethod.POST)
	void downloadAlacatedPdf(HttpServletResponse response) throws  ServletException,IOException,java.io.FileNotFoundException {
		List<PDFFile> files = new ArrayList<>();
		files.add(new PDFFile("erstes.pdf","HelloWorld".getBytes()));
		files.add(new PDFFile("zweites.pdf","Some Content".getBytes())) ;
		files.add(new PDFFile("drittes.pdf","This is not a portable document file".getBytes()));
		
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=alacarte.zip");
		
		
		
		String data = "afdavba";
		byte[] dataBytes= data.getBytes();
		String fileNameInZip = "abc.pdf";
		
		File pdfFile = new File("filename.pdf");
		
		try(ZipOutputStream zos = new ZipOutputStream(response.getOutputStream())){
			
			ZipEntry zipEntry = new ZipEntry(pdfFile.getName());
			zos.putNextEntry(zipEntry);
			
			//ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes());
			ByteArrayInputStream bais = new ByteArrayInputStream(dataBytes);
			
			byte[] buffer = new byte[1024];
			
			int len;
			while((len=bais.read(buffer))>0) {
				zos.write(buffer,0,len);
			}
			
			zos.closeEntry();
		} catch(IOException e){
           logger.error(e.getMessage(), e);
       }
		
	}
	
}















