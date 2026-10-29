package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j14 {

    /* JADX INFO: renamed from: a */
    public final e14 f21955a;

    /* JADX INFO: renamed from: b */
    public final mv2 f21956b;

    public j14(i14 i14Var, m52 m52Var) {
        this.f21955a = i14Var.f21012d;
        List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        this.f21956b = new mv2(listM6548i.size());
        int size = listM6548i.size();
        for (int i = 0; i < size; i++) {
            i14 i14Var2 = (i14) listM6548i.get(i);
            if (m52Var.m8196a(i14Var2.f21014f)) {
                this.f21956b.m8403a(i14Var2.f21014f);
            }
        }
    }
}
