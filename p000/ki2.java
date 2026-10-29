package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a */
    public lv2 f23139a;

    /* JADX INFO: renamed from: b */
    public hi2 f23140b;

    /* JADX INFO: renamed from: c */
    public oh2 f23141c;

    /* JADX INFO: renamed from: d */
    public long f23142d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f23143e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ oh2 f23144f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f23145g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ int f23146h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ C0779iz f23147i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ C0816jz f23148j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ int f23149k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ int f23150l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ long f23151m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ si2 f23152n;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final ni2 m7521a(int i, long j) {
        hi2 hi2Var = this.f23140b;
        Object objM6410d = hi2Var.m6410d(i);
        Object objM6408b = hi2Var.m6408b(i);
        oh2 oh2Var = this.f23141c;
        lv2 lv2Var = this.f23139a;
        List list = (List) lv2Var.m8197b(i);
        List list2 = list;
        if (list == null) {
            hi2 hi2Var2 = oh2Var.f26697c;
            lv2 lv2Var2 = oh2Var.f26698d;
            List listMo3576L = (List) lv2Var2.m8197b(i);
            if (listMo3576L == null) {
                Object objM6410d2 = hi2Var2.m6410d(i);
                listMo3576L = oh2Var.f26696b.mo3576L(oh2Var.f26695a.m7969a(i, objM6410d2, hi2Var2.m6408b(i)), objM6410d2);
                lv2Var2.m8121h(i, listMo3576L);
            }
            int size = listMo3576L.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((sq2) listMo3576L.get(i2)).mo5826e(j));
            }
            lv2Var.m8121h(i, arrayList);
            list2 = arrayList;
        }
        int i3 = i == this.f23145g + (-1) ? 0 : this.f23146h;
        boolean z = this.f23143e;
        C0779iz c0779iz = this.f23147i;
        C0816jz c0816jz = this.f23148j;
        df2 layoutDirection = this.f23144f.f26696b.getLayoutDirection();
        int i4 = this.f23149k;
        int i5 = this.f23150l;
        long j2 = this.f23151m;
        jh2 jh2Var = this.f23152n.f30308n;
        ni2 ni2Var = new ni2();
        ni2Var.f25846a = i;
        ni2Var.f25847b = list2;
        ni2Var.f25848c = z;
        ni2Var.f25849d = c0779iz;
        ni2Var.f25850e = c0816jz;
        ni2Var.f25851f = layoutDirection;
        ni2Var.f25852g = i4;
        ni2Var.f25853h = i5;
        ni2Var.f25854i = j2;
        ni2Var.f25855j = objM6410d;
        ni2Var.f25856k = objM6408b;
        ni2Var.f25857l = jh2Var;
        ni2Var.f25858m = j;
        ni2Var.f25867v = Integer.MIN_VALUE;
        int size2 = list2.size();
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            db3 db3Var = (db3) list2.get(i7);
            i6 += z ? db3Var.f16900b : db3Var.f16899a;
            iMax = Math.max(iMax, !z ? db3Var.f16900b : db3Var.f16899a);
        }
        ni2Var.f25860o = i6;
        ni2Var.f25865t = iMax;
        ni2Var.f25870y = new int[ni2Var.f25847b.size() * 2];
        if (z) {
            ni2Var.f25864s = i3;
            ni2Var.f25862q = i6;
            ni2Var.f25861p = iMax;
            ni2Var.f25863r = 0;
        } else {
            ni2Var.f25864s = 0;
            ni2Var.f25862q = iMax;
            ni2Var.f25861p = i6;
            ni2Var.f25863r = i3;
        }
        VarHandle.storeStoreFence();
        return ni2Var;
    }
}
