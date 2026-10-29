package p000;

import java.lang.invoke.VarHandle;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class gb4 implements vq4 {
    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        if (cs4Var.f16429a != Timestamp.class) {
            return null;
        }
        ou1Var.getClass();
        uq4 uq4VarM9271d = ou1Var.m9271d(new cs4(Date.class));
        hb4 hb4Var = new hb4();
        hb4Var.f20471a = uq4VarM9271d;
        VarHandle.storeStoreFence();
        return hb4Var;
    }
}
