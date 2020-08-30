package com.prottonne.rest.controller;

import com.prottonne.rest.dto.Request;
import com.prottonne.rest.dto.Response;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {

    @RequestMapping(
            path = "/path/{pathvariable}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Response method(
            @PathVariable(value = "pathvariable") String pathvariable,
            @RequestBody Request postPayload,
            @RequestHeader(value = "some-header") String someHeader
    ) {

        // TODO
        return new Response();
    }

    @RequestMapping(
            path = "/path/{pathvariable}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void downloadFile(
            @PathVariable(value = "pathvariable") String pathvariable,
            @RequestBody Request postPayload,
            @RequestHeader(value = "some-header") String someHeader,
            HttpServletResponse httpServletResponse
    ) {

        //TODO:
        // method to download a file using HttpServletResponse / no base64
    }

    @RequestMapping(
            path = "/path/{pathvariable}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Response uploadFile(
            @PathVariable(value = "pathvariable") String pathvariable,
            @RequestParam("file") MultipartFile file,
            @RequestHeader(value = "some-header") String someHeader
    ) {

        // TODO
        // method to upload a file using MultipartFile / no base64
        return new Response();
    }

}
