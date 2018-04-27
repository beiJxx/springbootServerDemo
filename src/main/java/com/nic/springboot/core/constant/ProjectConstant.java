package com.nic.springboot.core.constant;

/**
 * @author james
 * @Description:
 * @time 2018/4/26 0026 下午 15:07
 */
public class ProjectConstant {

	// @author
	public static final String AUTHOR = "nicJames";

	// 项目基础包名称
	public static final String BASE_PACKAGE = "com.nic.springboot";

	// Model所在包
	public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";

	// Dao所在包
	public static final String DAO_PACKAGE = BASE_PACKAGE + ".dao";

	// Mapper所在包
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";

	// Service所在包
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

	// ServiceImpl所在包
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

	// Controller所在包
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";

	// Mapper插件基础接口的完全限定名
	public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.universal.Mapper";


	// JDBC配置，请修改为你项目的实际配置
	public static final String JDBC_URL = "jdbc:oracle:thin:@192.168.70.102:1521:ora11gR2";
	public static final String JDBC_USERNAME = "inter";
	public static final String JDBC_PASSWORD = "inter";
	public static final String JDBC_DIVER_CLASS_NAME = "oracle.jdbc.OracleDriver";

	public static final String JAVA_PATH = "src/main/java"; // java文件路径
	public static final String TEMPLATE_FILE_PATH = "D:\\springCloud-workspace\\springboot-nicDemo\\springboot-demo\\src\\main\\resources\\templates\\generator";

	// 生成的Service存放路径
	public static final String PACKAGE_PATH_SERVICE = packageConvertPath(ProjectConstant.SERVICE_PACKAGE);
	// 生成的Service实现存放路径
	public static final String PACKAGE_PATH_SERVICE_IMPL = packageConvertPath(ProjectConstant.SERVICE_IMPL_PACKAGE);
	// 生成的Controller存放路径
	public static final String PACKAGE_PATH_CONTROLLER = packageConvertPath(ProjectConstant.CONTROLLER_PACKAGE);

	private static String packageConvertPath(String packageName) {
		return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
	}

}
