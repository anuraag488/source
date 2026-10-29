package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl3 {

    /* JADX INFO: renamed from: a */
    public static final sl3 f29396a;

    static {
        sl3 sl3Var = null;
        try {
            sl3Var = (sl3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sl3Var == null) {
            sl3Var = new sl3();
        }
        f29396a = sl3Var;
    }

    /* JADX INFO: renamed from: a */
    public static r90 m10361a(Class cls) {
        f29396a.getClass();
        r90 r90Var = new r90();
        r90Var.f29101a = cls;
        VarHandle.storeStoreFence();
        return r90Var;
    }

    /* JADX INFO: renamed from: b */
    public static bs4 m10362b(Class cls) {
        r90 r90VarM10361a = m10361a(cls);
        List list = Collections.EMPTY_LIST;
        f29396a.getClass();
        return sl3.m10871b(r90VarM10361a, list, false);
    }
}
