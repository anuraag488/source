package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e12 {

    /* JADX INFO: renamed from: a */
    public final String f17585a;

    /* JADX INFO: renamed from: b */
    public final float f17586b;

    /* JADX INFO: renamed from: c */
    public final float f17587c;

    /* JADX INFO: renamed from: d */
    public final float f17588d;

    /* JADX INFO: renamed from: e */
    public final float f17589e;

    /* JADX INFO: renamed from: f */
    public final float f17590f;

    /* JADX INFO: renamed from: g */
    public final float f17591g;

    /* JADX INFO: renamed from: h */
    public final float f17592h;

    /* JADX INFO: renamed from: i */
    public final List f17593i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f17594j;

    public e12(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = uw4.f32218a;
            list = v71.f32439a;
        }
        ArrayList arrayList = new ArrayList();
        this.f17585a = str;
        this.f17586b = f;
        this.f17587c = f2;
        this.f17588d = f3;
        this.f17589e = f4;
        this.f17590f = f5;
        this.f17591g = f6;
        this.f17592h = f7;
        this.f17593i = list;
        this.f17594j = arrayList;
    }
}
