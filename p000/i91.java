package p000;

import ads_mobile_sdk.ll0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f21184i = 1;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f21185j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f21186k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(boolean z, wp1 wp1Var) {
        super(1);
        this.f21185j = z;
        this.f21186k = wp1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        String str;
        byte b = this.f21184i;
        boolean z = this.f21185j;
        Object obj2 = this.f21186k;
        switch (b) {
            case 0:
                ((jp3) obj).m7255h(!z && ((Boolean) ((wp1) obj2).invoke()).booleanValue());
                return ju4.f22634a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((ll0) obj2).f6866f.m849V0() && z && (str = (String) entry.getValue()) != null && str.length() > 500) {
                    return entry.getKey() + " = [Debug dialog string omitted from screen due to length limit. Please use the Share option or Copy button to retrieve it.]";
                }
                return entry.getKey() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(ll0 ll0Var, boolean z) {
        super(1);
        this.f21186k = ll0Var;
        this.f21185j = z;
    }
}
