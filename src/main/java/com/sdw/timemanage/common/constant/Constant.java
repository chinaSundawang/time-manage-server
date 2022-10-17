package com.sdw.timemanage.common.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdw
 */
public class Constant {


	/**
	 * 响应状态
	 */
	public enum RespStatus {
		/**
		 * 成功
		 */
		SUCCESS(0),
		/**
		 * 失败
		 */
		FAIL(1),
		/**
		 * 接口出错
 		 */
		ERROR(4);
		private Integer code;

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		RespStatus(Integer code) {
			this.code = code;
		}
	}

}
