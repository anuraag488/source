package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sl3 {
    /* JADX INFO: renamed from: a */
    public static String m10870a(wq1 wq1Var) {
        String string = wq1Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: b */
    public static bs4 m10871b(r90 r90Var, List list, boolean z) {
        bs4 bs4Var = new bs4();
        bs4Var.f15554a = r90Var;
        bs4Var.f15555b = list;
        bs4Var.f15556c = z;
        VarHandle.storeStoreFence();
        return bs4Var;
    }
}
