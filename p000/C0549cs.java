package p000;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0549cs extends AbstractC0013ac {

    /* JADX INFO: renamed from: a */
    public Integer f16404a;

    /* JADX INFO: renamed from: b */
    public String f16405b;

    /* JADX INFO: renamed from: c */
    public String f16406c;

    /* JADX INFO: renamed from: d */
    public String f16407d;

    /* JADX INFO: renamed from: e */
    public String f16408e;

    /* JADX INFO: renamed from: f */
    public String f16409f;

    /* JADX INFO: renamed from: g */
    public String f16410g;

    /* JADX INFO: renamed from: h */
    public String f16411h;

    /* JADX INFO: renamed from: i */
    public String f16412i;

    /* JADX INFO: renamed from: j */
    public String f16413j;

    /* JADX INFO: renamed from: k */
    public String f16414k;

    /* JADX INFO: renamed from: l */
    public String f16415l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0013ac)) {
            return false;
        }
        AbstractC0013ac abstractC0013ac = (AbstractC0013ac) obj;
        return this.f16404a.equals(((C0549cs) abstractC0013ac).f16404a) && this.f16405b.equals(((C0549cs) abstractC0013ac).f16405b) && this.f16406c.equals(((C0549cs) abstractC0013ac).f16406c) && this.f16407d.equals(((C0549cs) abstractC0013ac).f16407d) && this.f16408e.equals(((C0549cs) abstractC0013ac).f16408e) && this.f16409f.equals(((C0549cs) abstractC0013ac).f16409f) && this.f16410g.equals(((C0549cs) abstractC0013ac).f16410g) && this.f16411h.equals(((C0549cs) abstractC0013ac).f16411h) && this.f16412i.equals(((C0549cs) abstractC0013ac).f16412i) && this.f16413j.equals(((C0549cs) abstractC0013ac).f16413j) && this.f16414k.equals(((C0549cs) abstractC0013ac).f16414k) && this.f16415l.equals(((C0549cs) abstractC0013ac).f16415l);
    }

    public final int hashCode() {
        return this.f16415l.hashCode() ^ ((((((((((((((((((((((this.f16404a.hashCode() ^ 1000003) * 1000003) ^ this.f16405b.hashCode()) * 1000003) ^ this.f16406c.hashCode()) * 1000003) ^ this.f16407d.hashCode()) * 1000003) ^ this.f16408e.hashCode()) * 1000003) ^ this.f16409f.hashCode()) * 1000003) ^ this.f16410g.hashCode()) * 1000003) ^ this.f16411h.hashCode()) * 1000003) ^ this.f16412i.hashCode()) * 1000003) ^ this.f16413j.hashCode()) * 1000003) ^ this.f16414k.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f16404a);
        sb.append(", model=");
        sb.append(this.f16405b);
        sb.append(", hardware=");
        sb.append(this.f16406c);
        sb.append(", device=");
        sb.append(this.f16407d);
        sb.append(", product=");
        sb.append(this.f16408e);
        sb.append(", osBuild=");
        sb.append(this.f16409f);
        sb.append(", manufacturer=");
        sb.append(this.f16410g);
        sb.append(", fingerprint=");
        sb.append(this.f16411h);
        sb.append(", locale=");
        sb.append(this.f16412i);
        sb.append(", country=");
        sb.append(this.f16413j);
        sb.append(", mccMnc=");
        sb.append(this.f16414k);
        sb.append(", applicationBuild=");
        return zi4.m13623w(sb, this.f16415l, "}");
    }
}
