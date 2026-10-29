package p000;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sq3 {

    /* JADX INFO: renamed from: a */
    public final r90 f30489a;

    /* JADX INFO: renamed from: b */
    public final Context f30490b;

    /* JADX INFO: renamed from: c */
    public final String f30491c;

    /* JADX INFO: renamed from: f */
    public Executor f30494f;

    /* JADX INFO: renamed from: g */
    public Executor f30495g;

    /* JADX INFO: renamed from: h */
    public C1040pn f30496h;

    /* JADX INFO: renamed from: i */
    public boolean f30497i;

    /* JADX INFO: renamed from: l */
    public final cp2 f30500l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f30501m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f30502n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f30503o;

    /* JADX INFO: renamed from: p */
    public boolean f30504p;

    /* JADX INFO: renamed from: q */
    public boolean f30505q;

    /* JADX INFO: renamed from: r */
    public boolean f30506r;

    /* JADX INFO: renamed from: s */
    public final boolean f30507s;

    /* JADX INFO: renamed from: d */
    public final ArrayList f30492d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f30493e = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final tq3 f30498j = tq3.f31335a;

    /* JADX INFO: renamed from: k */
    public final long f30499k = -1;

    public sq3(Context context, String str) {
        cp2 cp2Var = new cp2();
        cp2Var.f16332a = new LinkedHashMap();
        VarHandle.storeStoreFence();
        this.f30500l = cp2Var;
        this.f30501m = new LinkedHashSet();
        this.f30502n = new LinkedHashSet();
        this.f30503o = new ArrayList();
        this.f30504p = true;
        this.f30507s = true;
        this.f30489a = rl3.m10361a(WorkDatabase.class);
        this.f30490b = context;
        this.f30491c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10901a(at2... at2VarArr) {
        for (at2 at2Var : at2VarArr) {
            Integer numValueOf = Integer.valueOf(at2Var.f14858a);
            LinkedHashSet linkedHashSet = this.f30502n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(at2Var.f14859b));
        }
        at2[] at2VarArr2 = (at2[]) Arrays.copyOf(at2VarArr, at2VarArr.length);
        cp2 cp2Var = this.f30500l;
        cp2Var.getClass();
        for (at2 at2Var2 : at2VarArr2) {
            cp2Var.m4102a(at2Var2);
        }
    }
}
