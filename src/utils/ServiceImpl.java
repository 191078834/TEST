package utils;
import com.Books;
import moc.BookEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@org.springframework.stereotype.Service
public class ServiceImpl {

    public  Object objectInfect(Object src ,Object target, int targetStartIndex,int srcStartIndex){
        Method[] srcMethods = src.getClass().getMethods();
        Method[] targetMethods = target.getClass().getMethods();
        for (Method srcMe:srcMethods) {
            String srcName = srcMe.getName();
            if (srcName.startsWith("get")) {

                try {
                    Object result = srcMe.invoke(src);
                    System.out.println(result);
                    for (Method tarMe:targetMethods){
                        String tarName = tarMe.getName();
                      if(tarName.startsWith("set")&&tarName.substring(targetStartIndex,tarName.length()).equals(srcName.substring(srcStartIndex,srcName.length()))){
                                tarMe.invoke(target,result);
                      }
                    }


                } catch (Exception e) {
                    System.out.println(e);

                }
            }
        }

        return target;
    }


}
