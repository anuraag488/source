package p000;

import android.graphics.Rect;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14509a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nh4 f14510b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14511c;

    public /* synthetic */ ah4(byte b) {
        this.f14509a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f14509a) {
            case 0:
                nh4 nh4Var = this.f14510b;
                Object obj2 = this.f14511c;
                C0562d4 c0562d4 = new C0562d4((byte) 16);
                c0562d4.f16768b = nh4Var;
                c0562d4.f16769c = obj2;
                VarHandle.storeStoreFence();
                return c0562d4;
            default:
                nh4 nh4Var2 = this.f14510b;
                Object obj3 = this.f14511c;
                jl3 jl3VarM12845Q = y42.m12845Q((cf2) obj, true);
                nh4Var2.getTouchAreas().put(obj3, new Rect(qq2.m10010E(jl3VarM12845Q.f22396a), qq2.m10010E(jl3VarM12845Q.f22397b), qq2.m10010E(jl3VarM12845Q.f22398c), qq2.m10010E(jl3VarM12845Q.f22399d)));
                return ju4.f22634a;
        }
    }
}
