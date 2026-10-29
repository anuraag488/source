package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q82 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public ArrayList f28281a;

    /* JADX INFO: renamed from: b */
    public boolean f28282b;

    /* JADX INFO: renamed from: c */
    public String f28283c;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ArrayList arrayList = this.f28281a;
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (z62.m13387o(name, "supports") && z62.m13387o(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (z62.m13387o(name, "unsupported") && z62.m13387o(Void.TYPE, returnType)) {
            this.f28282b = true;
            return null;
        }
        if (z62.m13387o(name, "protocols") && objArr.length == 0) {
            return arrayList;
        }
        if ((z62.m13387o(name, "selectProtocol") || z62.m13387o(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list.get(i);
                        if (arrayList.contains(str)) {
                            this.f28283c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f28283c = str2;
                return str2;
            }
        }
        if ((!z62.m13387o(name, "protocolSelected") && !z62.m13387o(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.f28283c = (String) objArr[0];
        return null;
    }
}
