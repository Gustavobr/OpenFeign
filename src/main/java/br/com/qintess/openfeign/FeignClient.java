package br.com.qintess.openfeign;

import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.openfeign.FeignClient(name = "feignClient", url = "http://localhost:8081/", dismiss404 = true)
public interface FeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "/v1/contact/all", produces = MediaType.APPLICATION_JSON_VALUE)
	Page<ContactDTO> getAll();

}
