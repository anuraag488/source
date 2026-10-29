package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e54 {

    /* JADX INFO: renamed from: a */
    public C1260vl f17710a;

    /* JADX INFO: renamed from: b */
    public f54 f17711b;

    /* JADX INFO: renamed from: c */
    public Context f17712c;

    /* JADX INFO: renamed from: d */
    public String f17713d;

    /* JADX INFO: renamed from: e */
    public dg4 f17714e;

    /* JADX INFO: renamed from: f */
    public Set f17715f;

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m4934a(Object obj, ym0 ym0Var) throws Throwable {
        d54 d54Var;
        dg4 dg4Var = this.f17714e;
        if (ym0Var instanceof d54) {
            d54Var = (d54) ym0Var;
            int i = d54Var.f16791v;
            if ((i & Integer.MIN_VALUE) != 0) {
                d54Var.f16791v = i - Integer.MIN_VALUE;
            } else {
                d54Var = new d54(this, ym0Var);
            }
        } else {
            d54Var = new d54(this, ym0Var);
        }
        Object objInvoke = d54Var.f16789t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = d54Var.f16791v;
        boolean z = true;
        if (i2 == 0) {
            k43.m7376J(objInvoke);
            C1260vl c1260vl = this.f17710a;
            d54Var.f16791v = 1;
            objInvoke = c1260vl.invoke(obj, d54Var);
            if (objInvoke == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f17715f;
        if (set != null) {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) dg4Var.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        } else if (((SharedPreferences) dg4Var.getValue()).getAll().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
