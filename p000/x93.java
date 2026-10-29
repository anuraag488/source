package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x93 implements u93 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ u93 f34081a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f34082b;

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: a */
    public final Boolean mo11770a() {
        return this.f34081a.mo11770a();
    }

    @Override // p000.u93
    /* JADX INFO: renamed from: b */
    public final mq1 mo11304b() {
        return this.f34081a.mo11304b();
    }

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: c */
    public final Object mo11771c(wm0 wm0Var) {
        return this.f34081a.mo11771c(wm0Var);
    }

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: d */
    public final Object mo12534d(of4 of4Var) {
        return this.f34081a.mo12534d(of4Var);
    }

    @Override // p000.u93
    public final String getDescription() {
        List list = this.f34082b;
        C1053q c1053q = new C1053q((byte) 13);
        c1053q.f28113b = list;
        VarHandle.storeStoreFence();
        return hb0.m6305Q0(new C1041po(c1053q), "\n\n", null, null, 0, new t63((byte) 1), 30);
    }

    @Override // p000.u93
    public final g12 getIcon() {
        return this.f34081a.getIcon();
    }

    @Override // p000.u93
    public final String getTitle() {
        return this.f34081a.getTitle();
    }
}
