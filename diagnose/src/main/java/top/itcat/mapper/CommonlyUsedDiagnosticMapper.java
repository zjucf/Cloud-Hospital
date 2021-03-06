package top.itcat.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;
import top.itcat.entity.CommonlyUsedDiagnostic;

/**
 * <p>
 * 诊断 Mapper 接口
 * </p>
 *
 * @author ITcathyh
 * @since 2019-06-11
 */
@CacheNamespace(implementation = top.itcat.cache.RedisCache.class)
public interface CommonlyUsedDiagnosticMapper extends BaseMapper<CommonlyUsedDiagnostic> {

}
