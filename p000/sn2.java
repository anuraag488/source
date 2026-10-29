package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sn2 extends pn2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ac4 f30407a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f30408b;

    @Override // p000.pn2
    /* JADX INFO: renamed from: a */
    public final void mo9587a(k44 k44Var, String str, String str2, Throwable th) {
        Object value;
        List list;
        rn2 rn2Var;
        ac4 ac4Var = this.f30407a;
        wp1 wp1Var = this.f30408b;
        do {
            value = ac4Var.getValue();
            list = (List) value;
            long j = ((i41) wp1Var.invoke()).f21121a;
            String strM10712a0 = th != null ? se0.m10712a0(th) : null;
            rn2Var = new rn2();
            rn2Var.f29435a = j;
            rn2Var.f29436b = k44Var;
            rn2Var.f29437c = str2;
            rn2Var.f29438d = str;
            rn2Var.f29439e = strM10712a0;
            VarHandle.storeStoreFence();
        } while (!ac4Var.m198i(value, hb0.m6317c1(hb0.m6311W0(list, rn2Var), 1000)));
    }
}
