package androidx.work.impl;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p000.C0633f0;
import p000.C1126rz;
import p000.a25;
import p000.b25;
import p000.bc4;
import p000.bt2;
import p000.dg4;
import p000.eq2;
import p000.fj0;
import p000.g32;
import p000.ia5;
import p000.kg4;
import p000.l25;
import p000.m25;
import p000.mq4;
import p000.n72;
import p000.nu3;
import p000.o85;
import p000.r90;
import p000.rl3;
import p000.ry0;
import p000.sj3;
import p000.su0;
import p000.td3;
import p000.u25;
import p000.v71;
import p000.vq3;
import p000.w25;
import p000.z15;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: k */
    public final dg4 f14696k;

    /* JADX INFO: renamed from: l */
    public final dg4 f14697l;

    /* JADX INFO: renamed from: m */
    public final dg4 f14698m;

    /* JADX INFO: renamed from: n */
    public final dg4 f14699n;

    /* JADX INFO: renamed from: o */
    public final dg4 f14700o;

    /* JADX INFO: renamed from: p */
    public final dg4 f14701p;

    /* JADX INFO: renamed from: q */
    public final dg4 f14702q;

    public WorkDatabase_Impl() {
        a25 a25Var = new a25((byte) 0);
        a25Var.f70b = this;
        VarHandle.storeStoreFence();
        this.f14696k = new dg4(a25Var);
        a25 a25Var2 = new a25((byte) 1);
        a25Var2.f70b = this;
        VarHandle.storeStoreFence();
        this.f14697l = new dg4(a25Var2);
        a25 a25Var3 = new a25((byte) 2);
        a25Var3.f70b = this;
        VarHandle.storeStoreFence();
        this.f14698m = new dg4(a25Var3);
        a25 a25Var4 = new a25((byte) 3);
        a25Var4.f70b = this;
        VarHandle.storeStoreFence();
        this.f14699n = new dg4(a25Var4);
        a25 a25Var5 = new a25((byte) 4);
        a25Var5.f70b = this;
        VarHandle.storeStoreFence();
        this.f14700o = new dg4(a25Var5);
        a25 a25Var6 = new a25((byte) 5);
        a25Var6.f70b = this;
        VarHandle.storeStoreFence();
        this.f14701p = new dg4(a25Var6);
        a25 a25Var7 = new a25((byte) 6);
        a25Var7.f70b = this;
        VarHandle.storeStoreFence();
        this.f14702q = new dg4(a25Var7);
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: c */
    public final List mo3060c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        byte b = 13;
        byte b2 = 14;
        arrayList.add(new bt2(b, b2, (byte) 10));
        byte b3 = 15;
        z15 z15Var = new z15(b2, b3, (byte) 0);
        z15Var.f35704d = new o85((byte) 29);
        VarHandle.storeStoreFence();
        arrayList.add(z15Var);
        byte b4 = 16;
        int i = 17;
        arrayList.add(new bt2(b4, i, (byte) 11));
        int i2 = 18;
        arrayList.add(new bt2(i, i2, (byte) 12));
        int i3 = 19;
        arrayList.add(new bt2(i2, i3, b));
        int i4 = 20;
        z15 z15Var2 = new z15(i3, i4, (byte) 1);
        z15Var2.f35704d = new ia5((byte) 29);
        VarHandle.storeStoreFence();
        arrayList.add(z15Var2);
        arrayList.add(new bt2(i4, 21, b2));
        int i5 = 23;
        arrayList.add(new bt2(22, i5, b3));
        arrayList.add(new bt2(i5, 24, b4));
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: d */
    public final n72 mo3061d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String[] strArr = {"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"};
        n72 n72Var = new n72();
        n72Var.f25490a = this;
        boolean z = this.f14695j;
        C0633f0 c0633f0 = new C0633f0(1, n72Var, n72.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 21);
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = this;
        mq4Var.f25142c = linkedHashMap2;
        mq4Var.f25140a = z;
        mq4Var.f25144e = c0633f0;
        mq4Var.f25148i = new AtomicBoolean(false);
        mq4Var.f25149j = new nu3((byte) 18);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        mq4Var.f25143d = linkedHashMap3;
        String[] strArr2 = new String[7];
        for (int i = 0; i < 7; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            linkedHashMap3.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) linkedHashMap.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        mq4Var.f25145f = strArr2;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (linkedHashMap3.containsKey(lowerCase3)) {
                linkedHashMap3.put(((String) entry.getKey()).toLowerCase(locale2), eq2.m5273L(lowerCase3, linkedHashMap3));
            }
        }
        C1126rz c1126rz = new C1126rz();
        c1126rz.f29738b = new ReentrantLock();
        c1126rz.f29739c = new long[7];
        c1126rz.f29740d = new boolean[7];
        VarHandle.storeStoreFence();
        mq4Var.f25146g = c1126rz;
        su0 su0Var = new su0();
        su0Var.f30564a = bc4.m3547a(new int[7]);
        VarHandle.storeStoreFence();
        mq4Var.f25147h = su0Var;
        VarHandle.storeStoreFence();
        n72Var.f25491b = mq4Var;
        n72Var.f25492c = new LinkedHashMap();
        n72Var.f25493d = new ReentrantLock();
        fj0 fj0Var = new fj0((byte) 26);
        VarHandle.storeStoreFence();
        n72Var.f25494e = fj0Var;
        fj0 fj0Var2 = new fj0((byte) 27);
        VarHandle.storeStoreFence();
        n72Var.f25495f = fj0Var2;
        Collections.newSetFromMap(new IdentityHashMap());
        n72Var.f25496g = new Object();
        g32 g32Var = new g32((byte) 3);
        g32Var.f19558b = n72Var;
        VarHandle.storeStoreFence();
        mq4Var.f25149j = g32Var;
        VarHandle.storeStoreFence();
        return n72Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: e */
    public final vq3 mo3062e() {
        return new b25(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: f */
    public final ry0 mo3063f() {
        return (ry0) this.f14697l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: i */
    public final Set mo3066i() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: j */
    public final LinkedHashMap mo3067j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r90 r90VarM10361a = rl3.m10361a(u25.class);
        v71 v71Var = v71.f32439a;
        linkedHashMap.put(r90VarM10361a, v71Var);
        linkedHashMap.put(rl3.m10361a(ry0.class), v71Var);
        linkedHashMap.put(rl3.m10361a(w25.class), v71Var);
        linkedHashMap.put(rl3.m10361a(kg4.class), v71Var);
        linkedHashMap.put(rl3.m10361a(l25.class), v71Var);
        linkedHashMap.put(rl3.m10361a(m25.class), v71Var);
        linkedHashMap.put(rl3.m10361a(td3.class), v71Var);
        linkedHashMap.put(rl3.m10361a(sj3.class), v71Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: o */
    public final td3 mo3072o() {
        return (td3) this.f14702q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: s */
    public final kg4 mo3076s() {
        return (kg4) this.f14699n.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: u */
    public final l25 mo3078u() {
        return (l25) this.f14700o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: v */
    public final m25 mo3079v() {
        return (m25) this.f14701p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: w */
    public final u25 mo3080w() {
        return (u25) this.f14696k.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: x */
    public final w25 mo3081x() {
        return (w25) this.f14698m.getValue();
    }
}
