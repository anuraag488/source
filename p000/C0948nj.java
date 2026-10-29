package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: nj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0948nj extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f25877i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f25878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0948nj(Object obj, byte b) {
        super(0);
        this.f25877i = b;
        this.f25878j = obj;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f25877i;
        Object obj = this.f25878j;
        switch (b) {
            case 0:
                dp4 dp4Var = (dp4) obj;
                Object objMo11188l = dp4Var.f17258a.mo11188l();
                b91 b91Var = b91.f15170c;
                return Boolean.valueOf(objMo11188l == b91Var && dp4Var.f17261d.getValue() == b91Var);
            case 1:
                z31 z31Var = new z31();
                z31Var.f35735a = (a41) obj;
                VarHandle.storeStoreFence();
                return z31Var;
            case 2:
                return (List) obj;
            default:
                try {
                    return (List) ((wp1) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return v71.f32439a;
                }
        }
    }
}
