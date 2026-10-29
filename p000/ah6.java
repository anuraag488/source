package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ah6 {

    /* JADX INFO: renamed from: a */
    public static volatile ah6 f14512a;

    /* JADX INFO: renamed from: b */
    public static final ah6 f14513b;

    static {
        ah6 ah6Var = new ah6();
        Map map = Collections.EMPTY_MAP;
        VarHandle.storeStoreFence();
        f14513b = ah6Var;
    }
}
