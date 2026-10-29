package p000;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: vf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1254vf implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32561a;

    public /* synthetic */ C1254vf(byte b) {
        this.f32561a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32561a) {
            case 0:
                return z62.m13393u(((cg3) obj2).f16005a ? 1 : 0, ((cg3) obj).f16005a ? 1 : 0);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 2:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 3:
                String name = ((File) obj).getName();
                byte b = wq0.f33600f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    byte b3 = bArr2[i];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 5:
                return z62.m13393u(((l72) obj).f23831b, ((l72) obj2).f23831b);
            case 6:
                r52 r52Var = (r52) obj;
                r52 r52Var2 = (r52) obj2;
                return (r52Var.f27383b - r52Var.f27382a) - (r52Var2.f27383b - r52Var2.f27382a);
            case 7:
                wf2 wf2Var = (wf2) obj;
                wf2 wf2Var2 = (wf2) obj2;
                float f = wf2Var.f33300H.f14483p.f33613F;
                float f2 = wf2Var2.f33300H.f14483p.f33613F;
                return f == f2 ? z62.m13393u(wf2Var.m12296w(), wf2Var2.m12296w()) : Float.compare(f, f2);
            case 8:
                return z62.m13393u(((ni2) obj).f25846a, ((ni2) obj2).f25846a);
            case 9:
                return ((Number) r14.f28957b.invoke(obj, obj2)).intValue();
            default:
                return ((C0957ns) ((wp0) obj)).f26063a.compareTo(((C0957ns) ((wp0) obj2)).f26063a);
        }
    }
}
