package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 implements ec4 {

    /* JADX INFO: renamed from: a */
    public dw4 f20089a;

    /* JADX INFO: renamed from: b */
    public li4 f20090b;

    @Override // p000.ec4
    /* JADX INFO: renamed from: a */
    public final boolean mo5081a(Exception exc) {
        this.f20090b.m7989b(exc);
        return true;
    }

    @Override // p000.ec4
    /* JADX INFO: renamed from: b */
    public final boolean mo5082b(C1084qu c1084qu) {
        if (c1084qu.f28795b == 4 && !this.f20089a.m4784b(c1084qu)) {
            li4 li4Var = this.f20090b;
            String str = c1084qu.f28796c;
            if (str != null) {
                long j = c1084qu.f28798e;
                long j2 = c1084qu.f28799f;
                C0774iu c0774iu = new C0774iu();
                c0774iu.f21777a = str;
                c0774iu.f21778b = j;
                c0774iu.f21779c = j2;
                VarHandle.storeStoreFence();
                li4Var.m7988a(c0774iu);
                return true;
            }
            xy4.m12782k("Null token");
        }
        return false;
    }
}
