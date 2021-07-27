package com.icare.jetpackmvvm.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.icare.jetpackmvvm.R

class ShapeRelativeLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr), IShapeDrawable<ShapeRelativeLayout?> {
    private var mShape: Int
    private var mShapeWidth: Int
    private var mShapeHeight: Int
    private var mSolidColor: Int
    private var mTopLeftRadius: Int
    private var mTopRightRadius: Int
    private var mBottomLeftRadius: Int
    private var mBottomRightRadius: Int
    private var mStartColor: Int
    private var mCenterColor: Int
    private var mEndColor: Int
    private var mUseLevel: Boolean
    private var mAngle: Int
    private var mGradientType: Int
    private var mCenterX: Float
    private var mCenterY: Float
    private var mGradientRadius: Int
    private var mStrokeColor: Int
    private var mStrokeWidth: Int
    private var mDashWidth: Int
    private var mDashGap: Int
    override fun setShape(shape: Int): ShapeRelativeLayout {
        mShape = shape
        return this
    }

    override fun getShape(): Int {
        return mShape
    }

    override fun setShapeWidth(width: Int): ShapeRelativeLayout {
        mShapeWidth = width
        return this
    }

    override fun getShapeWidth(): Int {
        return mShapeWidth
    }

    override fun setShapeHeight(height: Int): ShapeRelativeLayout {
        mShapeHeight = height
        return this
    }

    override fun getShapeHeight(): Int {
        return mShapeHeight
    }

    override fun setSolidColor(color: Int): ShapeRelativeLayout {
        mSolidColor = color
        return this
    }

    override fun getSolidColor(): Int {
        return mSolidColor
    }

    override fun setTopLeftRadius(radius: Int): ShapeRelativeLayout {
        mTopLeftRadius = radius
        return this
    }

    override fun getTopLeftRadius(): Int {
        return mTopLeftRadius
    }

    override fun setTopRightRadius(radius: Int): ShapeRelativeLayout {
        mTopRightRadius = radius
        return this
    }

    override fun getTopRightRadius(): Int {
        return mTopRightRadius
    }

    override fun setBottomLeftRadius(radius: Int): ShapeRelativeLayout {
        mBottomLeftRadius = radius
        return this
    }

    override fun getBottomLeftRadius(): Int {
        return mBottomLeftRadius
    }

    override fun setBottomRightRadius(radius: Int): ShapeRelativeLayout {
        mBottomRightRadius = radius
        return this
    }

    override fun getBottomRightRadius(): Int {
        return mBottomRightRadius
    }

    override fun setStartColor(color: Int): ShapeRelativeLayout {
        mStartColor = color
        return this
    }

    override fun getStartColor(): Int {
        return mStartColor
    }

    override fun setCenterColor(color: Int): ShapeRelativeLayout {
        mCenterColor = color
        return this
    }

    override fun getCenterColor(): Int {
        return mCenterColor
    }

    override fun setEndColor(color: Int): ShapeRelativeLayout {
        mEndColor = color
        return this
    }

    override fun getEndColor(): Int {
        return mEndColor
    }

    override fun setUseLevel(useLevel: Boolean): ShapeRelativeLayout {
        mUseLevel = useLevel
        return this
    }

    override fun isUseLevel(): Boolean {
        return mUseLevel
    }

    override fun setAngle(angle: Int): ShapeRelativeLayout {
        mAngle = angle
        return this
    }

    override fun getAngle(): Int {
        return mAngle
    }

    override fun setGradientType(type: Int): ShapeRelativeLayout {
        mGradientType = type
        return this
    }

    override fun getGradientType(): Int {
        return mGradientType
    }

    override fun setCenterX(x: Float): ShapeRelativeLayout {
        mCenterX = x
        return this
    }

    override fun getCenterX(): Float {
        return mCenterX
    }

    override fun setCenterY(y: Float): ShapeRelativeLayout {
        mCenterY = y
        return this
    }

    override fun getCenterY(): Float {
        return mCenterY
    }

    override fun setGradientRadius(radius: Int): ShapeRelativeLayout {
        mGradientRadius = radius
        return this
    }

    override fun getGradientRadius(): Int {
        return mGradientRadius
    }

    override fun setStrokeColor(color: Int): ShapeRelativeLayout {
        mStrokeColor = color
        return this
    }

    override fun getStrokeColor(): Int {
        return mStrokeColor
    }

    override fun setStrokeWidth(width: Int): ShapeRelativeLayout {
        mStrokeWidth = width
        return this
    }

    override fun getStrokeWidth(): Int {
        return mStrokeWidth
    }

    override fun setDashWidth(width: Int): ShapeRelativeLayout {
        mDashWidth = width
        return this
    }

    override fun getDashWidth(): Int {
        return mDashWidth
    }

    override fun setDashGap(gap: Int): ShapeRelativeLayout {
        mDashGap = gap
        return this
    }

    override fun getDashGap(): Int {
        return mDashGap
    }

    override fun into() {
        background = build()
    }

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ShapeRelativeLayout)
        mShape =
            typedArray.getInt(R.styleable.ShapeRelativeLayout_shape, IShapeDrawable.DEFAULT_SHAPE)
        mShapeWidth = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_width,
            IShapeDrawable.DEFAULT_SHAPE_WIDTH
        )
        mShapeHeight = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_height,
            IShapeDrawable.DEFAULT_SHAPE_HEIGHT
        )
        mSolidColor = typedArray.getColor(
            R.styleable.ShapeRelativeLayout_shape_solidColor,
            IShapeDrawable.DEFAULT_SHAPE_SOLID_COLOR
        )
        val radius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_radius,
            IShapeDrawable.DEFAULT_SHAPE_RADIUS
        )
        mTopLeftRadius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_topLeftRadius,
            radius
        )
        mTopRightRadius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_topRightRadius,
            radius
        )
        mBottomLeftRadius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_bottomLeftRadius,
            radius
        )
        mBottomRightRadius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_bottomRightRadius,
            radius
        )
        mStartColor = typedArray.getColor(
            R.styleable.ShapeRelativeLayout_shape_startColor,
            IShapeDrawable.DEFAULT_SHAPE_START_COLOR
        )
        mCenterColor = typedArray.getColor(
            R.styleable.ShapeRelativeLayout_shape_centerColor,
            IShapeDrawable.DEFAULT_SHAPE_CENTER_COLOR
        )
        mEndColor = typedArray.getColor(
            R.styleable.ShapeRelativeLayout_shape_endColor,
            IShapeDrawable.DEFAULT_SHAPE_END_COLOR
        )
        mUseLevel = typedArray.getBoolean(
            R.styleable.ShapeRelativeLayout_shape_useLevel,
            IShapeDrawable.DEFAULT_SHAPE_USE_LEVEL
        )
        mAngle = typedArray.getFloat(
            R.styleable.ShapeRelativeLayout_shape_angle,
            IShapeDrawable.DEFAULT_SHAPE_ANGLE.toFloat()
        ).toInt()
        mGradientType = typedArray.getInt(
            R.styleable.ShapeRelativeLayout_shape_gradientType,
            IShapeDrawable.DEFAULT_SHAPE_GRADIENT_TYPE
        )
        mCenterX = typedArray.getFloat(
            R.styleable.ShapeRelativeLayout_shape_centerX,
            IShapeDrawable.DEFAULT_SHAPE_CENTER_X
        )
        mCenterY = typedArray.getFloat(
            R.styleable.ShapeRelativeLayout_shape_centerX,
            IShapeDrawable.DEFAULT_SHAPE_CENTER_Y
        )
        mGradientRadius = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_gradientRadius,
            radius
        )
        mStrokeColor = typedArray.getColor(
            R.styleable.ShapeRelativeLayout_shape_strokeColor,
            IShapeDrawable.DEFAULT_SHAPE_STROKE_COLOR
        )
        mStrokeWidth = typedArray.getDimensionPixelSize(
            R.styleable.ShapeRelativeLayout_shape_strokeWidth,
            IShapeDrawable.DEFAULT_SHAPE_STROKE_WIDTH
        )
        mDashWidth = typedArray.getDimension(
            R.styleable.ShapeRelativeLayout_shape_dashWidth,
            IShapeDrawable.DEFAULT_SHAPE_DASH_WIDTH.toFloat()
        ).toInt()
        mDashGap = typedArray.getDimension(
            R.styleable.ShapeRelativeLayout_shape_dashGap,
            IShapeDrawable.DEFAULT_SHAPE_DASH_GAP.toFloat()
        ).toInt()
        typedArray.recycle()
        if (background == null) {
            into()
        }
    }
}