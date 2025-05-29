API :
inner API (Internal)
outer API (External - network)
MVC - Design pattern for web app 
App1 , App2 - Protocol
REST (HTTP), SOAP, gPRC : developed by Google, Remote Procedure Calls

SOAP: Simple Object Access Protocol - HTTP:POST: Envelope (XML File), Operations,XML - WSDL
-- WSDL - Web Services Description Language
<!--- 
<Envelope>
include all header, response body
</Envelope>
-- >

It's very hard to develop SOAP API, but it's easy to consume. It will be consumed in WSDL file form

--> JSON (Format neutral), HTTP: GET, POST, PUT, DELETE, REST(resource)
--> REST - Representational State Transfer (Stateless)

MVC : JS View() : html/css/js -UI (We don't care of view when talk about mvc) -How it works ?
ViewResolver -JSP,
SPA: Single Page Application ?

@Controller for controller class (This class is eligible for any communication)
@RequestMapping("/student") -- / is root slash ? class level
@RequestMapping(method = RequestMethod.GET, path = "/getAll") , method level
//HTTP:GET http://localhost:8080/student/getAll

## Web Server ? 
Port is like door to go in or out

@RestController
