package com.zzz.aicode.service;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.zzz.aicode.model.dto.app.AppAddRequest;
import com.zzz.aicode.model.dto.app.AppQueryRequest;
import com.zzz.aicode.model.dto.app.AppUpdateRequest;
import com.zzz.aicode.model.entity.App;
import com.zzz.aicode.model.entity.User;
import com.zzz.aicode.model.vo.AppVO;
import jakarta.servlet.http.HttpServletRequest;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author zjr
 */
public interface AppService extends IService<App> {

    /**
     * 应用部署
     *
     * @param appId 应用 ID
     * @param loginUser
     * @return
     */
    String deployApp(Long appId, User loginUser);

    /**
     * 异步生成应用截图并更新封面
     *
     * @param appId  应用ID
     * @param appUrl 应用访问URL
     */
    void generateAppScreenshotAsync(Long appId, String appUrl);

    /**
     * 获取应用封装类
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 通过对话生成应用代码
     *
     * @param appId 应用ID
     * @param message 提示词
     * @param loginUser 登陆用户
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
