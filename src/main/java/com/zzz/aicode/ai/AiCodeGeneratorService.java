package com.zzz.aicode.ai;

import com.zzz.aicode.ai.model.HtmlCodeResult;
import com.zzz.aicode.ai.model.MultiFileCodeResult;
import dev.langchain4j.service.SystemMessage;

public interface AiCodeGeneratorService {

    /**
     * 生成代码
     * @param userMessage 用户提示词
     * @return AI输出的结果
     */
    @SystemMessage(fromResource = "prompt/codegen-html-system-prompt.txt")
    HtmlCodeResult generateHtmlCode(String userMessage);

    /**
     * 生成代码
     * @param userMessage 用户提示词
     * @return AI输出的结果
     */
    @SystemMessage(fromResource = "prompt/codegen-multi-file-system-prompt.txt")
    MultiFileCodeResult generateMultiFileCode(String userMessage);
}
