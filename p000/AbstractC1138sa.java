package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: sa */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138sa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f30026a = {new jw2(AbstractC1138sa.class, "analyticsEnabled", "getAnalyticsEnabled(Lessentials/data/Settings;)Z", 1)};

    /* JADX INFO: renamed from: b */
    public static final kj0 f30027b;

    /* JADX INFO: renamed from: c */
    public static final tt2 f30028c;

    static {
        sl3 sl3Var = rl3.f29396a;
        r90 r90VarM10361a = rl3.m10361a(InterfaceC0755ia.class);
        List list = Collections.EMPTY_LIST;
        sl3Var.getClass();
        bs4 bs4VarM10871b = sl3.m10871b(r90VarM10361a, list, true);
        C0598e4 c0598e4 = new C0598e4((byte) 2);
        c0598e4.f17678b = bs4VarM10871b;
        VarHandle.storeStoreFence();
        f30027b = as4.m3263v(c0598e4);
        f30028c = h44.m6219c("analytics_enabled", Boolean.TRUE, a10.f32a);
    }
}
