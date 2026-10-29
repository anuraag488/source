package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bm6 extends ot1 implements InterfaceC1261vm {

    /* JADX INFO: renamed from: k */
    public static final nh3 f15421k = new nh3("AppSet.API", new ll5((byte) 4), new gb5());

    /* JADX INFO: renamed from: i */
    public Context f15422i;

    /* JADX INFO: renamed from: j */
    public qt1 f15423j;

    @Override // p000.InterfaceC1261vm
    /* JADX INFO: renamed from: a */
    public final nr6 mo3636a() {
        if (this.f15423j.m10123b(this.f15422i, 212800000) != 0) {
            return y62.m12935A(new C1334xk(new Status(17, null, null, null)));
        }
        ki4 ki4Var = new ki4();
        ki4Var.f23155a = new ed1[]{sc6.f30172i};
        aj5 aj5Var = new aj5((byte) 28);
        VarHandle.storeStoreFence();
        ki4Var.f23158d = aj5Var;
        ki4Var.f23156b = false;
        ki4Var.f23157c = (short) 27601;
        return m9264c(0, ki4Var.m7522a());
    }
}
