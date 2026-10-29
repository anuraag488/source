package p000;

import java.lang.invoke.VarHandle;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h34 {

    /* JADX INFO: renamed from: a */
    public String f20338a;

    /* JADX INFO: renamed from: b */
    public int f20339b;

    /* JADX INFO: renamed from: c */
    public c34 f20340c;

    /* JADX INFO: renamed from: a */
    public final void m6209a() {
        String str = this.f20338a;
        int i = this.f20339b + 1;
        this.f20339b = i;
        String lowerCase = i == 0 ? str : od4.m9042W(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.ROOT);
        int i2 = this.f20339b;
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000;
        c34 c34Var = new c34();
        c34Var.f15784a = lowerCase;
        c34Var.f15785b = str;
        c34Var.f15786c = i2;
        c34Var.f15787d = jCurrentTimeMillis;
        VarHandle.storeStoreFence();
        this.f20340c = c34Var;
    }
}
