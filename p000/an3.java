package p000;

import java.lang.invoke.VarHandle;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class an3 implements ai3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14640a;

    /* JADX INFO: renamed from: b */
    public ai3 f14641b;

    /* JADX INFO: renamed from: c */
    public ai3 f14642c;

    public /* synthetic */ an3(byte b) {
        this.f14640a = b;
    }

    @Override // p000.ai3
    public final Object get() {
        switch (this.f14640a) {
            case 0:
                C0533cn c0533cn = (C0533cn) this.f14641b.get();
                ro0 ro0Var = (ro0) this.f14642c.get();
                zm3 zm3Var = new zm3();
                zm3Var.f36185a = c0533cn;
                zm3Var.f36186b = ro0Var;
                VarHandle.storeStoreFence();
                return zm3Var;
            case 1:
                r50 r50Var = new r50((byte) 22);
                f70 f70Var = new f70((byte) 21);
                C0504bu c0504bu = C0504bu.f15597f;
                Object obj = this.f14641b.get();
                ai3 ai3Var = this.f14642c;
                pt3 pt3Var = new pt3();
                pt3Var.f27972a = (iw3) obj;
                pt3Var.f27973b = r50Var;
                pt3Var.f27974c = f70Var;
                pt3Var.f27975d = c0504bu;
                pt3Var.f27976e = ai3Var;
                VarHandle.storeStoreFence();
                return pt3Var;
            default:
                h34 h34Var = new h34();
                h34Var.f20338a = od4.m9042W(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.ROOT);
                h34Var.f20339b = -1;
                VarHandle.storeStoreFence();
                return h34Var;
        }
    }
}
