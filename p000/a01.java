package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a01 {

    /* JADX INFO: renamed from: a */
    public final String f9a;

    /* JADX INFO: renamed from: b */
    public final long[] f10b = new long[2];

    /* JADX INFO: renamed from: c */
    public final ArrayList f11c = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public final ArrayList f12d = new ArrayList(2);

    /* JADX INFO: renamed from: e */
    public boolean f13e;

    /* JADX INFO: renamed from: f */
    public boolean f14f;

    /* JADX INFO: renamed from: g */
    public C1126rz f15g;

    /* JADX INFO: renamed from: h */
    public int f16h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ d01 f17i;

    public a01(d01 d01Var, String str) {
        this.f17i = d01Var;
        this.f9a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f11c.add(this.f17i.f16664a.m9386d(sb.toString()));
            sb.append(".tmp");
            this.f12d.add(this.f17i.f16664a.m9386d(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final b01 m2a() {
        if (!this.f13e || this.f15g != null || this.f14f) {
            return null;
        }
        ArrayList arrayList = this.f11c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            d01 d01Var = this.f17i;
            if (i >= size) {
                this.f16h++;
                b01 b01Var = new b01();
                b01Var.f14979c = d01Var;
                b01Var.f14977a = this;
                VarHandle.storeStoreFence();
                return b01Var;
            }
            if (!d01Var.f16679p.m7089j((p83) arrayList.get(i))) {
                try {
                    d01Var.m4255u(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
