package org.go.show.cloud.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger文档
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//	public Docket docket() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("网关swagger接口文档")
//				.apiInfo(new ApiInfoBuilder().title("网关swagger接口文档")
//						.contact(new Contact("show-cloud", "", "show-cloud@126.com")).version("1.0").build())
//				.select().paths(PathSelectors.any()).build();
//	}



	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("微服务API文档")
				.description("微服务API文档")
				.termsOfServiceUrl("http://localhost:9002")
				.version("1.0")
				.build();
	}


	@Bean
	UiConfiguration uiConfig() {
		return new UiConfiguration(null, "list", "alpha", "schema",
				UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
	}

}
