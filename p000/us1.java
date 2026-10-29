package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class us1 extends AbstractC1235ux implements InterfaceC1074qk {

    /* JADX INFO: renamed from: b */
    public final Set f32145b;

    public us1(Context context, Looper looper, int i, C0602e8 c0602e8, rt1 rt1Var, st1 st1Var) {
        tn6 tn6VarM11074a = tn6.m11074a(context);
        pt1 pt1Var = pt1.f27970d;
        y42.m12854a0(rt1Var);
        y42.m12854a0(st1Var);
        byte b = 25;
        w42 w42Var = new w42(b, false);
        w42Var.f33090b = rt1Var;
        VarHandle.storeStoreFence();
        wd3 wd3Var = new wd3(b);
        wd3Var.f33259b = st1Var;
        VarHandle.storeStoreFence();
        super(context, looper, tn6VarM11074a, pt1Var, i, w42Var, wd3Var, (String) c0602e8.f17871e);
        Set set = (Set) c0602e8.f17869c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                C1077qn.m9989o("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.f32145b = set;
    }

    @Override // p000.InterfaceC1074qk
    /* JADX INFO: renamed from: a */
    public final Set mo9894a() {
        return requiresSignIn() ? this.f32145b : Collections.EMPTY_SET;
    }

    @Override // p000.AbstractC1235ux
    public final Account getAccount() {
        return null;
    }

    @Override // p000.AbstractC1235ux
    public final Set getScopes() {
        return this.f32145b;
    }
}
