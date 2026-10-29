package p000;

import android.graphics.Typeface;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 implements wl0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25020a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25021b;

    public /* synthetic */ mm1(byte b) {
        this.f25020a = b;
    }

    @Override // p000.wl0
    public final void accept(Object obj) {
        byte b = 0;
        switch (this.f25020a) {
            case 0:
                om1 om1Var = (om1) obj;
                if (om1Var == null) {
                    om1Var = new om1(-3);
                }
                z32 z32Var = (z32) this.f25021b;
                jo3 jo3Var = (jo3) z32Var.f35739c;
                jp0 jp0Var = (jp0) z32Var.f35738b;
                int i = om1Var.f26878b;
                if (i != 0) {
                    q60 q60Var = new q60(b == true ? 1 : 0);
                    q60Var.f28237c = jp0Var;
                    q60Var.f28236b = i;
                    VarHandle.storeStoreFence();
                    jo3Var.execute(q60Var);
                    return;
                }
                Typeface typeface = om1Var.f26877a;
                ar1 ar1Var = new ar1((byte) 1);
                ar1Var.f14798b = jp0Var;
                ar1Var.f14799c = typeface;
                VarHandle.storeStoreFence();
                jo3Var.execute(ar1Var);
                return;
            case 1:
                om1 om1Var2 = (om1) obj;
                synchronized (pm1.f27745c) {
                    try {
                        x64 x64Var = pm1.f27746d;
                        ArrayList arrayList = (ArrayList) x64Var.get((String) this.f25021b);
                        if (arrayList == null) {
                            return;
                        }
                        x64Var.remove((String) this.f25021b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((wl0) arrayList.get(i2)).accept(om1Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                cf0 cf0Var = ((C1015oz) this.f25021b).f27240a;
                tg3 tg3Var = new tg3();
                tg3Var.f31144a = (f00) obj;
                tg3Var.f31145b = arrayList2;
                VarHandle.storeStoreFence();
                cf0Var.m4989U(tg3Var);
                return;
            default:
                ((C0964nz) this.f25021b).m8899a((f00) obj);
                return;
        }
    }
}
