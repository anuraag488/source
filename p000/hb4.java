package p000;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hb4 extends uq4 {

    /* JADX INFO: renamed from: b */
    public static final gb4 f20470b = new gb4();

    /* JADX INFO: renamed from: a */
    public uq4 f20471a;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) {
        Date date = (Date) this.f20471a.mo166b(kb2Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) {
        this.f20471a.mo167c(yb2Var, (Timestamp) obj);
    }
}
