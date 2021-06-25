package com.longforus.mvpautocodeplus;

/**
 * Created by XQ Yang on 2018/6/28  11:02.
 * @describe 模版常量
 */

public interface TemplateCons {

    String CONTRACT_TP_CONTENT_JAVA =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME};#end\n" + "\n" + "import ${V};\n" + "import ${P};\n" + "import ${M};\n" + "/**\n" + " * @describe \n" +
            " * @author  ${USER}\n" + " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" +
            "public interface I${NAME}Contract {\n" + "    interface IView extends ${VN}${VG}{}\n" + "    interface I${P_OR_M} extends ${PN}${PG}{}\n" +
            "    interface IModel extends ${MN}${MG}{}\n" + "}\n";
    String CONTRACT_TP_CONTENT_NO_MODEL_JAVA =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME};#end\n" + "\n" + "import ${V};\n" + "import ${P};\n" + "/**\n" + " * @describe \n" + " * @author  ${USER}\n" +
            " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" + "public interface I${NAME}Contract {\n" +
            "    interface IView extends ${VN}${VG}{}\n" + "    interface I${P_OR_M} extends ${PN}${PG}{}\n" + "}\n";

    String CONTRACT_TP_CONTENT_KOTLIN =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME}#end\n" + "\n" + "import ${V}\n" + "import ${P}\n" + "import ${M}\n" + "/**\n" + " * @describe \n" +
            " * @author  ${USER}\n" + " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" + "interface ${NAME} {\n" +
            "    interface IView : ${VN}${VG}{}\n" + "    interface I${P_OR_M} : ${PN}${PG}{}\n" + "    interface IModel : ${MN}${MG}{}\n" + "}\n";

    //${ENTER_NAME}
    String CONTRACT_TP_CONTENT_NO_MODEL_KOTLIN =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME}#end\n" + "\n" + "import ${V}\n" + "import ${P}\n" + "/**\n" + " * @describe \n" + " * @author  ${USER}\n" +
            " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" + "interface ${NAME} {\n" +
            "    interface IView : ${VN}${VG}{}\n" + "    interface I${P_OR_M} : ${PN}${PG}{}\n" + "}\n";
    //${ENTER_NAME}

    String COMMON_IMPL_TP_CONTENT_JAVA =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME};#end\n" + "\n" + "import ${CONTRACT};\n" + "import ${CUR_APP_PACKAGE}.R;\n" + "#if (${IMPL} != \"\")import ${IMPL};#end\n" + "\n" + "\n" + "/**\n" +
            " * @describe \n" + " * @author  ${USER}\n" + " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" +
            "public class ${NAME}${IMPL_TYPE} #if(${IMPL}!=\"\") extends ${IMPL}${VG}#end implements I${NAME}Contract.I${TYPE} {\n" + "\n" + "}\n" + "\n";


    String COMMON_IMPL_TP_CONTENT_KOTLIN =
        "#if (${PACKAGE_NAME} != \"\")package ${PACKAGE_NAME}#end\n" + "\n" + "import ${CONTRACT}\n" + "import ${CUR_APP_PACKAGE}.R\n" + "#if (${IMPL} != \"\")import ${IMPL}#end\n" + "\n" + "/**\n" +
            " * @describe \n" + " * @author  ${USER}\n" + " * @date ${DATE}  ${TIME}\n" + " * \t\t\t\t\t\t\t\t - generate by MvpAutoCodePlus plugin.\n" + " */\n" + "\n" +
            "class ${NAME}${IMPL_TYPE} :#if (${IMPL_NP} != \"\") ${IMPL_NP}${VG}(),#end ${CONTRACT_NP}.I${TYPE} {\n" + "\n" + "}\n" + "\n";
}
