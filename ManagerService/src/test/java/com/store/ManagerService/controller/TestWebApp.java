package com.store.ManagerService.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//import com.store.ManagerService.entity.EmployeeEntity;

public class TestWebApp extends ManagerControllerTest {
		@Autowired
		private WebApplicationContext webApplicationContext;

		private MockMvc mockMvc;

		@Before
		public void setup() {
			mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		}

		@Test
		public void testEmployee() throws Exception {
			mockMvc.perform(get("http://localhost:8089/store/employee/1")).andExpect(status().isOk())
					.andExpect(content().contentType("application/json;charset=UTF-8"))
					.andExpect(jsonPath("$.emp_id").value("1"))
					.andExpect(jsonPath("$.emp_name").value("abc"))
					.andExpect(jsonPath("$.emp_level").value("small"))
					.andExpect(jsonPath("$.dept_id").value(4545))
					.andExpect(jsonPath("$.emp_hiredate").value(2020-01-06))
					.andExpect(jsonPath("$.emp_sal").value(10000))
					.andExpect(jsonPath("$.user_id").value(1));
					

		}

	}


