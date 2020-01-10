package com.itzyzx.framework.util.consts;

/**
 * @CLassName FileUpDownConstants
 * @Description:  上传下载工具常量类
 * @date: 2020/1/2 17:51
 * @Version 1.0
 */
public class FileUpDownConstants {

	/**
	 * rnfs地址
	 * 例如 ：http://192.168.37.7:3309/rnfg/%s?username=smrz$password=loaz!QAZ
	 */
	public static final String RNFS_URL="http://%s/rnfs/%s?%s";

	/**
	 * rnfs传值： 上传
	 */
	public static final String UPLOAD="upload";
	/**
	 * rnfs传值： 下载
	 */
	public static final String DOWNLOAD="download";
	/**
	 * 文件编码
	 */
	public static final String FILE_CHAR_SET="ISO8859-1";

	/**
	 * onest上传下载 url固定前缀
	 */
	public static final String ONEST_URL_PREFIX="oNest";
	/**
	 * 文件类型，fileType P图片，V视频
	 */
	public static final String  FILE_TYPE_P="P";
	/**
	 * 文件类型，fileType P图片，V视频
	 */
	public static final String  FILE_TYPE_V="V";
	/**
	 * 图片后缀
	 */
	public enum IMAGE_SUFFIX{
		PNG(".png"),JPG(".jpg"),JPEG(".jpeg");
		String  suffix;
		public String  getSuffix(){return suffix;}

		public void setSuffix(String suffix){this.suffix=suffix;}

		private IMAGE_SUFFIX(String suffix){this.suffix=suffix;}

	}
}
