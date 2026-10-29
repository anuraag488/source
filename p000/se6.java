package p000;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class se6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30219a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mg6 f30220b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Bundle f30221c;

    public /* synthetic */ se6(byte b) {
        this.f30219a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f30219a) {
            case 0:
                mg6 mg6Var = this.f30220b;
                mg6Var.mo5038t();
                mg6Var.m9741u();
                Bundle bundle2 = this.f30221c;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                y42.m12851X(string);
                y42.m12851X(string2);
                y42.m12854a0(bundle2.get("value"));
                oa6 oa6Var = (oa6) mg6Var.f36084a;
                if (!oa6Var.m9018a()) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12504a("Conditional property not set since app measurement is disabled");
                } else {
                    xm6 xm6Var = new xm6(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        dn6 dn6Var = oa6Var.f26517i;
                        oa6.m9014j(dn6Var);
                        bundle2.getString("app_id");
                        ys5 ys5VarM4598W = dn6Var.m4598W(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        oa6.m9014j(dn6Var);
                        bundle2.getString("app_id");
                        ys5 ys5VarM4598W2 = dn6Var.m4598W(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        oa6Var.m9027n().m9146P(new yo5(bundle2.getString("app_id"), string2, xm6Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), ys5VarM4598W2, bundle2.getLong("trigger_timeout"), ys5VarM4598W, bundle2.getLong("time_to_live"), dn6Var.m4598W(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                mg6 mg6Var2 = this.f30220b;
                Bundle bundle3 = this.f30221c;
                rr5 rr5Var = mg6Var2.f24897U;
                oa6 oa6Var2 = (oa6) mg6Var2.f36084a;
                if (bundle3.isEmpty()) {
                    bundle = bundle3;
                } else {
                    s86 s86Var = oa6Var2.f26513e;
                    dn6 dn6Var2 = oa6Var2.f26517i;
                    op5 op5Var = oa6Var2.f26512d;
                    d76 d76Var2 = oa6Var2.f26514f;
                    oa6.m9014j(s86Var);
                    bundle = new Bundle(s86Var.f29984W.m10190a());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            oa6.m9014j(dn6Var2);
                            if (dn6.m4563D0(obj)) {
                                dn6.m4564K(rr5Var, null, 27, null, null, 0);
                            }
                            oa6.m9016l(d76Var2);
                            d76Var2.f16840o.m12506c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (dn6.m4569S(str)) {
                            oa6.m9016l(d76Var2);
                            d76Var2.f16840o.m12505b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            oa6.m9014j(dn6Var2);
                            op5Var.getClass();
                            if (dn6Var2.m4586E0("param", str, 500, obj)) {
                                dn6Var2.m4592J(bundle, str, obj);
                            }
                        }
                    }
                    oa6.m9014j(dn6Var2);
                    dn6 dn6Var3 = ((oa6) op5Var.f36084a).f26517i;
                    oa6.m9014j(dn6Var3);
                    int i = dn6Var3.m4600Z(201500000) ? 100 : 25;
                    if (bundle.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle.remove(str2);
                            }
                        }
                        oa6.m9014j(dn6Var2);
                        dn6.m4564K(rr5Var, null, 26, null, null, 0);
                        oa6.m9016l(d76Var2);
                        d76Var2.f16840o.m12504a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                s86 s86Var2 = oa6Var2.f26513e;
                oa6.m9014j(s86Var2);
                s86Var2.f29984W.m10195f(bundle);
                if (!bundle3.isEmpty() || oa6Var2.f26512d.m9225E(null, e56.f17762W0)) {
                    oa6Var2.m9027n().m9148z(bundle);
                }
                break;
        }
    }
}
