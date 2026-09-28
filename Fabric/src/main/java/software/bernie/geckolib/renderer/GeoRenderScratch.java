package software.bernie.geckolib.renderer;

import org.joml.Vector3f;
import org.joml.Vector4f;

/**
 * Per-thread scratch vectors reused by {@link GeoRenderer}'s default cube rendering,
 * to avoid allocating a new vector for every quad normal and every vertex position
 */
final class GeoRenderScratch {
	static final ThreadLocal<GeoRenderScratch> INSTANCE = ThreadLocal.withInitial(GeoRenderScratch::new);

	final Vector3f normal = new Vector3f();
	final Vector4f position = new Vector4f();

	private GeoRenderScratch() {}
}
